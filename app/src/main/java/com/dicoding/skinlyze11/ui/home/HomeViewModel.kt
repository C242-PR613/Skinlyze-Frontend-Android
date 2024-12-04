package com.dicoding.skinlyze11.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    // LiveData untuk greeting teks
    private val _greetingText = MutableLiveData<String>().apply {
        value = "Hello, Rahman"
    }
    val greetingText: LiveData<String> = _greetingText

    // LiveData untuk subjudul atau informasi tambahan
    private val _subtitleText = MutableLiveData<String>().apply {
        value = "Selamat datang di Skinlyze."
    }
    val subtitleText: LiveData<String> = _subtitleText

    // LiveData untuk berita judul
    private val _newsTitle = MutableLiveData<String>().apply {
        value = "Berita Terkini"
    }
    val newsTitle: LiveData<String> = _newsTitle

    // LiveData untuk kategori (contoh: daftar kategori)
    private val _categories = MutableLiveData<List<String>>().apply {
        value = listOf("Skincare", "Diet", "Hidrasi", "Perawatan", "Dokter Kulit", "Tips Harian")
    }
    val categories: LiveData<List<String>> = _categories
}
