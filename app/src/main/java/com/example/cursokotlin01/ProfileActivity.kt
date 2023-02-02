package com.example.cursokotlin01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentContainerView

class ProfileActivity : AppCompatActivity() {

    private val cardViewFotos : CardView by lazy {
        findViewById(R.id.button_fotos)
    }

    private val cardViewCuriosidades : CardView by lazy {
        findViewById(R.id.button_curiosidades)
    }

    private val textViewProfile : TextView by lazy {
        findViewById(R.id.text_view_profile)
    }

    private val imageViewProfile: ImageView by lazy {
        findViewById(R.id.image_view_profile)
    }

    private val fragmentContainerView : FragmentContainerView by lazy {
        findViewById(R.id.fragment_container_view_one)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        textViewProfile.text = getStringOfProfile()

        imageViewProfile.setImageResource(R.mipmap.ic_fma_foreground)

        cardViewFotos.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(fragmentContainerView.id, FragmentFotos())
                commit()
            }
        }
        cardViewCuriosidades.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(fragmentContainerView.id, FragmentCuriosidades())
                commit()
            }
        }
    }

    private fun getStringOfProfile() : String {
        var profile = Profile("marcos@gmail.com", "Marcos Henrique" ,"24 anos", "Manaus")
        return " ${profile.nome} \n ${profile.idade} \n ${profile.cidade}"
    }
}