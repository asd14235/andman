package com.neppplus.andman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chagneBtn1.setOnClickListener {
            Toast.makeText(this, "회원 가입 불가", Toast.LENGTH_SHORT).show()
        }
        
        chagneBtn2.setOnClickListener {
            Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
        }

        }

    }
