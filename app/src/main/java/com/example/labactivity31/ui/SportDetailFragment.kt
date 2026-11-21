package com.example.labactivity31.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.labactivity31.databinding.FragmentSportDetailBinding
import com.example.labactivity31.repository.SportsRepository

class SportDetailFragment : Fragment() {

    private var _binding: FragmentSportDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSportDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sportId = arguments?.getString("sportId") ?: "football"
        val sport = SportsRepository.getSportById(sportId) ?: SportsRepository.sportsList.first()

        with(binding) {
            txtDetailTitle.text = sport.name
            chipDetailCategory.text = sport.category
            imgDetailIcon.setImageResource(sport.iconResId)
            txtDetailOverview.text = sport.fullDescription
            txtDetailRules.text = sport.rules
            txtDetailLeagues.text = sport.popularLeagues
            txtDetailTeams.text = sport.topTeams
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
