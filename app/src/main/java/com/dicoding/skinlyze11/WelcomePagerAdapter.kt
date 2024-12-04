package com.dicoding.skinlyze

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.skinlyze11.R

class WelcomePagerAdapter(private val context: Context) :
    RecyclerView.Adapter<WelcomePagerAdapter.ViewHolder>() {

    private val layouts = listOf(
        R.layout.layout_welcome1, // Halaman 1
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(layouts[viewType], parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Tidak perlu bind data karena layout sudah statis
    }

    override fun getItemCount(): Int = layouts.size

    override fun getItemViewType(position: Int): Int = position

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}