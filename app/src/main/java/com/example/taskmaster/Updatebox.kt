package com.example.taskmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Updatebox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_box)
        val pos= intent.getIntExtra("id",-1)
        if(pos!= -1)
        {
            val title=DataObject.getData(pos).title
            val priority=DataObject.getData(pos).priority
            var create_title: EditText =findViewById(R.id.createTitle)
            var Create_priorty: EditText =findViewById(R.id.createPriority)
            create_title.setText(title)
            Create_priorty.setText(priority)

            var delete_button: Button= findViewById(R.id.deleteBtn)
            delete_button.setOnClickListener{
                DataObject.deleteData(pos)
                myIntrnt()
            }

            var Update_button : Button= findViewById(R.id.updateBtn)
            Update_button.setOnClickListener{
                DataObject.updateData(pos,title,priority)
                myIntrnt()
            }


        }

    }

    fun myIntrnt(){
        val intent = Intent(this,TaskManagement::class.java)
        startActivity(intent)

    }
}