package com.example.virtualschool;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentRecyclerAdapter.StudentViewHolder> {
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_list_item, parent, false);
        return new StudentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        //firebase code
        // .
        // .
        // .
        // .


    }

    @Override
    public int getItemCount() {
        //firebase code
        // .
        // .
        // .
        // .
        return 0;
    }




     public class StudentViewHolder extends RecyclerView.ViewHolder{

         public StudentViewHolder(@NonNull View itemView) {
             super(itemView);
         }
     }

}
