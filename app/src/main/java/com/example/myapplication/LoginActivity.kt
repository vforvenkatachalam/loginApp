package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        signInBTN.setOnClickListener(View.OnClickListener {
            var user = userNameET.text.toString()
            var pass = passwordET.text.toString()
            if(user.equals("looperex",true) ||  user.equals("venkat",true) && pass.equals("admin", true)){
                Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
                var intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("NAME", user)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Invalid",Toast.LENGTH_LONG).show()
            }
        })

    }
}