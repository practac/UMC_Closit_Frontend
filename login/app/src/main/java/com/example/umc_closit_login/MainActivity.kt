package com.example.umc_closit_login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // activity_login.xml 연결

        // 회원가입 버튼 클릭 이벤트 설정
        val btnRegister = findViewById<TextView>(R.id.btn_register)
        btnRegister.setOnClickListener {
            // RegisterActivity로 이동
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
