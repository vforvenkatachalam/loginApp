package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.MyRecyclerAdapter
import com.example.myapplication.model.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arrayList:ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sample = intent.getStringExtra("NAME")
        Toast.makeText(this, sample, Toast.LENGTH_LONG).show();
        initListViews();
        //initRecyclerViews()
    }

    private fun initListViews() {

        arrayList.add(1)
        arrayList.add(2)
        arrayList.add(3)
        arrayList.add(4)
        arrayList.add(11)
        arrayList.add(12)
        arrayList.add(13)
        //mainTV.text = intent.getStringExtra("NAME")
        var arrAdapter = ArrayAdapter(this, R.layout.item_list, arrayList)
        listView.adapter = arrAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity, arrayList[position].toString(), Toast.LENGTH_LONG).show()
        }
    }

    private fun initRecyclerViews() {
        var studentList: ArrayList<Student> = ArrayList()
        studentList.add(Student(101,"Arjun", 28, "English"))
        studentList.add(Student(102,"Priya", 22, "Maths"))
        studentList.add(Student(103,"Jenny", 32, "Social "))
        studentList.add(Student(104,"Bhargav", 18, "Moral "))
        studentList.add(Student(105,"Venkat", 44, "Physics"))

        var myRecyclerAdapter: MyRecyclerAdapter = MyRecyclerAdapter(this, studentList)
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = myRecyclerAdapter
    }
}