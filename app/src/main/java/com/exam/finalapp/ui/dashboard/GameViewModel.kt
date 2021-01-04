package com.exam.finalapp.ui.dashboard


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class GameViewModel:ViewModel() {
    companion object {
        private lateinit var game: CardMatchingGame
    }
    //一个game用来改变
    private var _game:MutableLiveData<CardMatchingGame> = MutableLiveData()
    //另一个用于外部访问
    val games=_game

    init {
        //初始化_game为空
        _game.value=CardMatchingGame(24)
    }

    fun reset(){
        _game.value?.reset()
    }

    fun chooseCardAtIndex(i:Int){
        _game.value?.chooseCardAtIndex(i)
    }

}