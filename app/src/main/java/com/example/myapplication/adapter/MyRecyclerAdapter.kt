package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.model.Student

class MyRecyclerAdapter(var mainActivity: MainActivity, var studentList: ArrayList<Student>) :
    RecyclerView.Adapter<MyRecyclerAdapter.MyRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewHolder {
        var view: View = LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item, parent,false)
        return MyRecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyRecyclerViewHolder, position: Int) {
        holder.stud_name.setText(studentList.get(position).name)
        holder.stud_age.setText(studentList.get(position).age.toString())
        holder.stud_subj.setText(studentList.get(position).suject)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    class MyRecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var stud_name: TextView = view.findViewById(R.id.student_name)
        var stud_age: TextView = view.findViewById(R.id.student_age)
        var stud_subj: TextView = view.findViewById(R.id.student_subject)
    }
}
