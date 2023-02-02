package com.example.cursokotlin01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val editEmailText : EditText by lazy {
        findViewById(R.id.edit_text_login)
    }

    private val editPasswordText : EditText by lazy {
        findViewById(R.id.edit_text_password)
    }

    private val buttonLogin : Button by lazy {
        findViewById(R.id.button_login)
    }

    private lateinit var email : String
    private lateinit var password : String
    var mutableList = mutableListOf<Profile>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mutableList.add(Profile("marcos@gmail.com","Marcos Henrique" ,"24 anos", "Manaus"))
        buttonLogin.setOnClickListener {
            email = editEmailText.text.toString()
            password = editPasswordText.text.toString()
            validateInfo()
        }
    }

    private fun validateInfo() {
        if (checkIfEmailContainAt() && validatePasswordLenght() &&
                validatePasswordNumberAndChar() && validatePasswordUpperCase()) {
            if(checkIfEmailIsSaved()) {
                val intent : Intent = Intent(this,ProfileActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Email informado não encontrado",
                    Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, "Ops, algo deu errado \n Tente novamente",
                    Toast.LENGTH_LONG).show()
        }
    }

    private fun checkIfEmailContainAt() : Boolean{
        return email.contains("@")
    }

    private fun validatePasswordLenght() : Boolean {
        return password.length > 4
    }

    private fun validatePasswordNumberAndChar() : Boolean {
        var hasNumber = false
        var hasLetter = false
        password.forEach {
            if (it.isDigit()) {
                hasNumber = true
            } else if (it.isLetter()) {
                hasLetter = true
            }
        }
        return hasNumber && hasLetter
    }

    private fun validatePasswordUpperCase() : Boolean {
        password.forEach {
            if (it.isUpperCase()) {
                return true
            }
        }
        return false
    }

    private fun checkIfEmailIsSaved() : Boolean {
        mutableList.forEach{
            if(it.email == email){
                return true
            }
        }
        return false
    }
}