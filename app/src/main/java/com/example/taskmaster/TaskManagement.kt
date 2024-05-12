package com.example.taskmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TaskManagement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_management)
        var ADD:Button=findViewById(R.id.add)
        var recycler_view: RecyclerView = findViewById(R.id.recycler_view)
        ADD.setOnClickListener{
            val intent=Intent(this,CreateBox::class.java)
            startActivity(intent)
        }

        val DeleteAll:Button=findViewById(R.id.deleteAll)
        DeleteAll.setOnClickListener{
            DataObject.deleteAll()

        }

        recycler_view.adapter= Adapter(DataObject.getAllData())
        recycler_view.layoutManager=LinearLayoutManager(this)
    }
}