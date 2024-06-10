package com.example.programa531

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var workoutRecyclerView: RecyclerView
    private lateinit var workoutAdapter: WorkoutAdapter
    private val workouts = listOf(
        Workout(1, "5+", "65 75 85"),
        Workout(2, "3+", "70 80 90"),
        Workout(3, "1+", "75 85 95")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workoutRecyclerView = findViewById(R.id.workoutRecyclerView)
        workoutRecyclerView.layoutManager = LinearLayoutManager(this)
        workoutAdapter = WorkoutAdapter(workouts)
        workoutRecyclerView.adapter = workoutAdapter
    }
}