package com.example.labactivity31.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labactivity31.databinding.ItemSportCardBinding
import com.example.labactivity31.model.Sport

class SportsAdapter(
    private val sports: List<Sport>,
    private val onSportClick: (Sport) -> Unit
) : RecyclerView.Adapter<SportsAdapter.SportViewHolder>() {

    class SportViewHolder(val binding: ItemSportCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportViewHolder {
        val binding = ItemSportCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SportViewHolder, position: Int) {
        val sport = sports[position]
        with(holder.binding) {
            txtSportName.text = sport.name
            chipCategory.text = sport.category
            txtSportDesc.text = sport.shortDescription
            imgSportIcon.setImageResource(sport.iconResId)

            cardSport.setOnClickListener {
                onSportClick(sport)
            }
        }
    }

    override fun getItemCount(): Int = sports.size
}
