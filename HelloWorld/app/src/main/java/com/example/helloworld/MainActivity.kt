package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*button*/
        var button: Button = findViewById(R.id.btn_register)

        /*EditText*/
        var edtUsername: EditText = findViewById(R.id.edt_username)
        var edtEmail: EditText = findViewById(R.id.edt_email)
        var edtPassword: EditText = findViewById(R.id.edt_password)

        /*Textviews*/
        var tvWelcomeTxt: TextView = findViewById(R.id.tv_welcome_txt)
        var tvEmail: TextView = findViewById(R.id.tv_email)

        button.setOnClickListener {
            var username = edtUsername.text
            var email = edtEmail.text
            var pass = edtPassword.text

            Toast.makeText(this, "You have registered successfully!", Toast.LENGTH_SHORT).show()

            tvWelcomeTxt.text = "Welcome $username"
            tvEmail.text = email
        }
    }
}