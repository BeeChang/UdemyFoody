package com.example.yoonchang.udemyfoody.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yoonchang.udemyfoody.R
import com.example.yoonchang.udemyfoody.adapters.IngredientsAdapter
import com.example.yoonchang.udemyfoody.autoCleared
import com.example.yoonchang.udemyfoody.databinding.FragmentIngredientsBinding
import com.example.yoonchang.udemyfoody.databinding.FragmentOverviewBinding
import com.example.yoonchang.udemyfoody.models.Result
import com.example.yoonchang.udemyfoody.util.Constants.Companion.RECIPE_RESULT_KEY
import com.example.yoonchang.udemyfoody.viewmodels.MainViewModel


class IngredientsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private var binding by autoCleared<FragmentIngredientsBinding>()
    private val mAdapter: IngredientsAdapter by lazy { IngredientsAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentIngredientsBinding.inflate(inflater, container, false)
        val args = arguments
        val myBundle: Result? = args?.getParcelable(RECIPE_RESULT_KEY)

        binding.ingredientsRecyclerview.adapter = mAdapter
        binding.ingredientsRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        myBundle?.extendedIngredients?.let { mAdapter.setData(it) }

        return binding.root

    }


}