package com.geektech.month5_hw1

import android.view.Display.Mode
import com.geektech.month5_hw1.model.Model
import com.geektech.month5_hw1.presenter.Presenter

class Injector {

    companion object{
        fun getModel() = Model()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}