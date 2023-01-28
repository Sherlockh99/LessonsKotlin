package com.sherlock.gb.kotlin.lessons

//class Repository {
object Repository {

    // lateinit позволяет инициализировать переменную позже
    lateinit var weather: Weather

    /**
     * Варианты инициализации переменной
    //1 вариант через init
    private val weatherList: List<Weather>
    /**
     * Блок инициализаци init
    */
    init{
    weatherList = listOf(Weather("Kyiv",17))
    }
     */
    /**
     * 2 вариант сразу
     */
    private val _weatherList: List<Weather> = listOf(Weather("Kyiv",17))

    /**
     * объявляем / переопределяем setter
     * value  - это значение, которое мы присваиваем
     */
    private var weatherList: List<Weather> = listOf<Weather>()
        set(value){
            field  =value
        }

    /**
     * каждый раз при вызове hasData будет вызван метод get
     */
    val hasData : Boolean
        get() = weatherList.size!=0


    /**
    fun getWeatherList():List<Weather>{
    return weatherList
    }
     */
    fun getWeatherList():List<Weather> = _weatherList

    fun blabla(parametr: String, pos: Int): Int{
        return 0
    }

    /**
     * Если в теле не указано, что возвращает функция, то она возвращает Unit
     */
    fun func2(){

    }

    /**
     * принимает на вход массив строк
     */
    fun printStrings(vararg strings: String){
        for (s in strings){
            println(s)
        }
    }
}