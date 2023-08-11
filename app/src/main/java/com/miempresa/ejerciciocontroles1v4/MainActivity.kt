package com.miempresa.ejerciciocontroles1v4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEvaluar.setOnClickListener(){
            var numero:Int = txtNumero.text.toString().toInt()
            if(numero % 2 == 0){
                radioPar.isChecked = true
            }else{
                radioImpar.isChecked = true
            }
        }
    }
}