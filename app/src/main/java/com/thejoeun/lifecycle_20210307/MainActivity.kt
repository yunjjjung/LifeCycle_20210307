package com.thejoeun.lifecycle_20210307

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "onCreate 실행됨")
        moveToOtherBtn.setOnClickListener {

            val myIntent = Intent(this, OtherActivity::class.java)

            startActivity(myIntent)

        }
    }

    override fun onResume() {
        super.onResume()
        
        Log.d("메인화면", "onResume 실행됨")
        
//        가정 : 리스트뷰로 => 게시판이 구현된 상황
//        게시글 목록을 자동 새로고침 : onResume 에 새로고침 코드 작성.        
        
    }

    override fun onPause() {
        super.onPause()
        
        Log.d("메인화면", "onPause 실행됨")
        
//        자원소모가 많은 기능 (ex. GPS 위치 실시간 추적) => 전화받을 경우 등 화면에 보여주지 않아도 될때 일시중지
//        어떤 기능들을 사용하려고 하면 onPause 편집을 강제시킴
        
    }
}