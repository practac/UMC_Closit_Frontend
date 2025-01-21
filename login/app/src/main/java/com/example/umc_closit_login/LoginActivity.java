package com.example.umc_closit_login;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // activity_login.xml 파일 로드

        // FragmentManager를 사용하여 fragment_register 추가
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        RegisterFragment registerFragment = new RegisterFragment();
        fragmentTransaction.replace(R.id.fragment_container, registerFragment);
        fragmentTransaction.commit();
    }
}
