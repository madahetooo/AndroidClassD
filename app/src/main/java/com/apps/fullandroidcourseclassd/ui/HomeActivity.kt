package com.apps.fullandroidcourseclassd.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.apps.fullandroidcourseclassd.MainActivity
import com.apps.fullandroidcourseclassd.R
import com.apps.fullandroidcourseclassd.bullscarsapp.ui.BullsCarsActivity
import com.apps.fullandroidcourseclassd.calculatorapp.CalculatorFragment
import com.apps.fullandroidcourseclassd.databinding.ActivityHomeBinding
import com.apps.fullandroidcourseclassd.restuarantapp.ResturantMenuActivity
import com.apps.fullandroidcourseclassd.todolistapp.ui.TodoListActivity

@Suppress("DEPRECATION")
class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        setCurrentFragment(TodoListActivity())
        val todolistFragment = TodoListActivity()
        val restaurantFragment = ResturantMenuActivity()
        val counterFragment = MainActivity()
        val calculatorFragment = CalculatorFragment()
        val bullsCarFragment = BullsCarsActivity()

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miTodoList -> setCurrentFragment(todolistFragment)
                R.id.miRestaurant -> setCurrentFragment(restaurantFragment)
                R.id.miCounter -> setCurrentFragment(counterFragment)
                R.id.miCalculator -> setCurrentFragment(calculatorFragment)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit() // apply changes
        }

}