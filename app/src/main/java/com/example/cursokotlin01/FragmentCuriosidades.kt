package com.example.cursokotlin01

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class FragmentCuriosidades : Fragment() {

    private val textViewOne : TextView by lazy {
        requireView().findViewById(R.id.text_view_curiosidades)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_curiosidade, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewOne.text = "   -> Durante o fenômeno Superlua, calcula-se que o diâmetro lunar possa aumentar em até 14%. \n" +
                "   -> Há uma lâmpada que permanece ligada continuamente há mais de 113 anos na cidade de Livermore, na Califórnia.\n" +
                "   -> O cérebro humano é formado por, aproximadamente, 75% de água. \n" +
                "   -> O cachorro-quente é uma invenção alemã do século XV.\n" +
                "   -> Alguns animais, como os cangurus, não param de crescer mesmo atingindo a idade adulta.\n"
    }
}