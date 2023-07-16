package com.geektech.month5_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geektech.month5_hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    private var presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickers()
    }

    private fun initClickers() {
        with(binding){
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast(congratulation: String) {
        Toast.makeText(this, congratulation, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.counterTv.setTextColor(color)
    }
}