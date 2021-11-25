package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern
import java.util.regex.Pattern.compile

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var pattern: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email_login)
        password = findViewById(R.id.password_login)
        pattern = ("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,50}" +
                "\\@" +
                "[a-z][a-z\\-]{0,8}" +
                "(" +
                "\\." +
                "[a-z][a-z\\-]{0,5}" +
                ")+")
    }
fun EmailValid(email:String): Boolean{return compile(pattern).matcher(email).matches()}
    fun login(view: android.view.View) {
     if (email.text.isNotEmpty() && password.text.isNotEmpty()) {
         if (EmailValid(email.text.toString())) {
             Toast.makeText(this, "Вы вошли", Toast.LENGTH_SHORT).show()
         }
         else {
             val alert2 = AlertDialog.Builder(this)
                 .setTitle("Ошибка в поле email")
                 .setMessage("Проверьте поле email на правильность ввода")
                 .setNegativeButton("Ok",null)
                 .create()
                 .show()
         }
     }
else {
    val alert = AlertDialog.Builder(this)
        .setTitle("Ошибка входа")
        .setMessage("У вас есть пустые поля")
        .setPositiveButton("Ok",null)
        .create()
        .show()

     }
    }

    fun register(view: android.view.View) {
        val reg = Intent(this,SignUpActivity::class.java)
        startActivity(reg)
    }
}