package com.example.customprofileapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentPhotos : Fragment() {

    private val photosAdapter: PhotosAdapter by lazy {
        PhotosAdapter(generateLandscapePhotos(urlList))
    }

    private val urlList : List<String> by lazy {
        Utils().urlList
    }

    private val recyclerViewPhotos: RecyclerView by lazy {
        requireView().findViewById(R.id.recycler_view_photos)
    }

    private val floatingActionButtonAddPhoto : FloatingActionButton by lazy {
        requireView().findViewById(R.id.floating_action_button_fragment_photos)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewPhotos.adapter = photosAdapter
        floatingActionButtonAddPhoto.setOnClickListener {
            photosAdapter.addItem(generateNextLandscapePhoto(urlList, photosAdapter.itemCount+1))
            recyclerViewPhotos.adapter?.notifyItemInserted(photosAdapter.itemCount)
            recyclerViewPhotos.scrollToPosition(photosAdapter.itemCount-1)
        }
    }

    private fun generateLandscapePhotos(landscapeUrls: List<String>) : MutableList<Photo> {
        var i = 0
        return MutableList(Utils().initialValueRecyclerView) {
            i += 1
            generateNextLandscapePhoto(landscapeUrls, i)
        }
    }

    private fun generateNextLandscapePhoto(landscapeUrls: List<String>, ind: Int): Photo {
        return Photo(landscapeUrls[(landscapeUrls.indices).random()], "Imagem $ind")
    }
}