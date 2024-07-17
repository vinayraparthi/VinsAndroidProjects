package com.vinay.vinsandroidprojects;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView  list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App","Our very first project, the default 'Hello World' app!",R.drawable.getting_started),
                new Project("Vin Quote","Making a simple change to the layout, with my own personal motivational quote for software developers",R.drawable.quote),
                new Project("BMI Calculator","A real life working BMI calculator teaching me variable, Methods and conditional Logic",R.drawable.calculator),
                new Project("Inches Converter","A basic converter to convert inches to meters (my own personal calculator app made on my own)",R.drawable.tape),
                new Project("The Hungry Developer","A menu app for a fictional restaurant, learning about activities, classes & Objects, Arrays, Intents ans ListViews ",R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);


    }
}