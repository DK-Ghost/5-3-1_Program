package com.example.programa531

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkoutAdapter(private val workouts: List<Workout>) :
    RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>() {

    class WorkoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val weekTextView: TextView = itemView.findViewById(R.id.weekTextView)
        val repsTextView: TextView = itemView.findViewById(R.id.repsTextView)
        val percentagesTextView: TextView = itemView.findViewById(R.id.percentagesTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_workout, parent, false)
        return WorkoutViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        val currentItem = workouts[position]
        holder.weekTextView.text = "Week ${currentItem.week}"
        holder.repsTextView.text = "Reps: ${currentItem.reps}"
        holder.percentagesTextView.text = "Percentages: ${currentItem.percentages}"
    }

    override fun getItemCount() = workouts.size
}