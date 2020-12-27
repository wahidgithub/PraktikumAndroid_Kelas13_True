package com.rafiq.praktikumandroidkelas13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StudentResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_result)

        val tvNpm = findViewById<TextView>(R.id.tvNpm)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvIpk = findViewById<TextView>(R.id.tvIpk)
        val tvPhoneNumber = findViewById<TextView>(R.id.tvPhoneNumber)

        val student = intent.getParcelableExtra<Student>("student");

        if (student == null){
            val npm = intent.getStringExtra("npm")
            val name = intent.getStringExtra("name")
            val ipk = intent.getDoubleExtra("ipk",0.0)
            val phoneNumber = intent.getStringExtra("phoneNumber")

            tvNpm.text = npm
            tvName.text = name
            tvIpk.text = ipk.toString()
            tvPhoneNumber.text = phoneNumber
        }else{
            tvNpm.text = student.npm
            tvName.text = student.name
            tvIpk.text = student.ipk.toString()
            tvPhoneNumber.text = student.phoneNumber
        }

    }
}