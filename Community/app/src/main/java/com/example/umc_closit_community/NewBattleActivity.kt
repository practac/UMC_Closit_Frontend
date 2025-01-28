package com.example.umc_closit_community

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewBattleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newbattle)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val continueButton = findViewById<Button>(R.id.continueButton)

        // 3열 그리드 레이아웃 설정
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // 더미 데이터 (이미지 URL 리스트)
        val imageList = List(15) { "https://example.com/image_$it.jpg" }

        // RecyclerView 어댑터 설정
        val adapter = ImageAdapter(this, imageList)
        recyclerView.adapter = adapter

        // "Continue" 버튼 클릭 이벤트
        continueButton.setOnClickListener {
            // 클릭 시 동작
        }
    }
}
