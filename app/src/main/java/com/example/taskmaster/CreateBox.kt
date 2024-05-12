package com.example.taskmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateBox : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_box)
        var save_button:Button=findViewById(R.id.savebtn)
        var create_title: EditText =findViewById(R.id.createTitle)
        var Create_priorty:EditText=findViewById(R.id.createPriority)
        save_button.setOnClickListener{
            if(create_title.text.toString().trim{it<=' '}.isNotEmpty()
                && Create_priorty.text.toString().trim{it<=' '}.isNotEmpty())
            {
                var title= create_title.getText().toString()
                var priority= Create_priorty.getText().toString()
                DataObject.setData(title,priority)
                val intent= Intent(this,TaskManagement::class.java)
                startActivity(intent)
            }

        }

    }
}