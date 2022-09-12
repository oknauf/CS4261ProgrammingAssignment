package com.example.programmingassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val name = findViewById<EditText>(R.id.nameEntry).text.toString()
        val username = findViewById<EditText>(R.id.usernameEntry).text.toString()
        val db = Firebase.firestore
        db.collection("user_data").document(username).set(hashMapOf("name" to name))
    }
}