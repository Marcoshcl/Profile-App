package com.example.cursokotlin01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class FragmentFotos : Fragment() {

    private val imageViewOne : ImageView by lazy {
        requireView().findViewById(R.id.image_view_one)
    }

    private val imageViewTwo : ImageView by lazy {
        requireView().findViewById(R.id.image_view_two)
    }

    private val imageViewThree : ImageView by lazy {
        requireView().findViewById(R.id.image_view_three)
    }

    private val imageViewFour : ImageView by lazy {
        requireView().findViewById(R.id.image_view_four)
    }

    private val imageViewFive : ImageView by lazy {
        requireView().findViewById(R.id.image_view_five)
    }

    private val imageViewSix : ImageView by lazy {
        requireView().findViewById(R.id.image_view_six)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fotos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageViewOne.setImageResource(R.mipmap.ic_img_1_foreground)
        imageViewTwo.setImageResource(R.mipmap.ic_img_2_foreground)
        imageViewThree.setImageResource(R.mipmap.ic_img_3_foreground)
        imageViewFour.setImageResource(R.mipmap.ic_img_4_foreground)
        imageViewFive.setImageResource(R.mipmap.ic_img_5_foreground)
        imageViewSix.setImageResource(R.mipmap.ic_img_6_foreground)
    }
}