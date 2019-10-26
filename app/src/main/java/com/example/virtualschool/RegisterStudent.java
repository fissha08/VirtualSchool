package com.example.virtualschool;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterStudent extends AppCompatActivity {
    private TextView mName,mGender, mDepartment;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_student);
        mName = findViewById(R.id.edName);
        mGender = findViewById(R.id.edGender);
        mDepartment = findViewById(R.id.edDepartment);
        mButton = findViewById(R.id.btnAddStudent);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                String gender = mGender.getText().toString();
                String department = mDepartment.getText().toString();

                Student student = new Student(name, gender, department, "");

                //firebase code
            }
        });
    }
}
