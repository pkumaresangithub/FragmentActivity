package com.example.fragmentactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button homebtn,sms,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sms = findViewById(R.id.sms);
        homebtn = findViewById(R.id.homebtn);
        email = findViewById(R.id.mail);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            HomeFragment homeFragment = new HomeFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentlayout,homeFragment,homeFragment.getTag()).commit();
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsFragment smsFragment = new SmsFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentlayout,smsFragment,smsFragment.getTag()).commit();

            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EmailFragment emailFragment = new EmailFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentlayout,emailFragment,emailFragment.getTag()).commit();

            }
        });

    }
}