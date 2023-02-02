package com.example.customprofileapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentCuriosities : Fragment() {

    private val recyclerViewCuriosity: RecyclerView by lazy {
        requireView().findViewById(R.id.recycler_view_curiosity)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_curiosidade, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerViewCuriosity.layoutManager = LinearLayoutManager(this.context,
            LinearLayoutManager.VERTICAL,false)
        recyclerViewCuriosity.adapter = CuriosityAdapter()
    }
}