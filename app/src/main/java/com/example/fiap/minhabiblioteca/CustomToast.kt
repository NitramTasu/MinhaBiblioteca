package com.example.fiap.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.example.fiap.minhabiblioteca.R.id.tv_toast

class CustomToast {
    fun showToast(context: Context, mensagem: String){
        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var customToastroot = inflater.inflate(R.layout.custom_toast, null)

        var customToast = Toast(context)

        customToast.view = customToastroot

        var tv_toast = customToastroot.findViewById<TextView>(R.id.tv_toast)
        tv_toast.text = mensagem
        customToast.duration = Toast.LENGTH_LONG
        customToast.show()
    }
}