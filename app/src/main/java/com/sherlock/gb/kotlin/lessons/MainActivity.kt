package com.sherlock.gb.kotlin.lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Repository.getWeatherList()

        val w = Weather()
        val w1 = Weather("Odessa",10)
        val w2 = Weather()
        val w3 = Weather()
        w.setWeather("Yuzhnoukrainsk")
        w.town = "Kyiv"

        w2.setWeather("Uman",false,7)
        w3.setWeather("Striy", temp = 5, isHomeTown = false)

        //val town = "Kyiv" - при таком объявлении town мы не сможем переопределить
        var town = "Kyiv"
        town = "Odessa"

        val weatherList = ArrayList<Weather>()
        weatherList.add(Weather())
    }
}

/**
 *
 * при наследовании от вышестоящего класса, которому нужно передать параметр
 * при вызове метода супер, необходимо этот параметр указать в объявлении текущего класса
 * В данном случае itemViev передастся в RecyclerView.ViewHolder.
 * Метод super будет вызван автоматически
class WeatherViewHolder(itemViev: View):RecyclerView.ViewHolder(itemViev)
 */