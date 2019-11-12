package com.example.snpgm12employeeinformationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSubmitButtonPressed(View v)
    {
        EditText firstName = this.findViewById(R.id.firstName);
        String empFN = firstName.getText().toString();

        EditText lastName = this.findViewById(R.id.lastName);
        String empLN = lastName.getText().toString();

        EditText age = this.findViewById(R.id.age);
        String empAge = age.getText().toString();

        EditText height = this.findViewById(R.id.height);
        String empHeight = height.getText().toString();

        EditText weight = this.findViewById(R.id.weight);
        String empWeight = weight.getText().toString();

        Employee employee1 = new Employee(empFN,empLN,empAge,empHeight,empWeight);


        TextView outputToEmployee = this.findViewById(R.id.employeeOutput);
        outputToEmployee.setText(employee1.employeeGreeting());



    }
}
