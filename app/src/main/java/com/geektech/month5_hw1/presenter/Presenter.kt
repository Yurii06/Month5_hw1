package com.geektech.month5_hw1.presenter

import android.graphics.Color
import com.geektech.month5_hw1.CounterView
import com.geektech.month5_hw1.Injector

class Presenter constructor(private var view: CounterView) {

    private var model = Injector.getModel()

    fun increment() {
        model.increment()
        view.showCount(model.count)
        showToast()
        setTextColor()
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count)
        showToast()
        setTextColor()
    }

    private fun showToast() {
        if (model.count == 10)
            view.showToast("Поздравляем")
    }

    private fun setTextColor() {
        if (model.count >= 15){
            view.changeTextColor(Color.GREEN)
        }else {
            view.changeTextColor(Color.BLACK)
        }
    }

}