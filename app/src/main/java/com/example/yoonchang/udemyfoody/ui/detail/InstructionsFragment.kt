package com.example.yoonchang.udemyfoody.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.yoonchang.udemyfoody.R
import com.example.yoonchang.udemyfoody.autoCleared
import com.example.yoonchang.udemyfoody.databinding.FragmentInstructionsBinding
import com.example.yoonchang.udemyfoody.databinding.FragmentOverviewBinding
import com.example.yoonchang.udemyfoody.models.Result
import com.example.yoonchang.udemyfoody.util.Constants


class InstructionsFragment : Fragment() {
    private var binding by autoCleared<FragmentInstructionsBinding>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInstructionsBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args?.getParcelable(Constants.RECIPE_RESULT_KEY)

        binding.instructionsWebView.webViewClient = object : WebViewClient() {}
        val websiteUrl: String = myBundle!!.sourceUrl
        binding.instructionsWebView.loadUrl(websiteUrl)

        return binding.root
    }


}