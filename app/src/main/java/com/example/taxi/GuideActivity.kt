package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class GuideActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    lateinit var tab: TabLayout
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
        viewPager = findViewById(R.id.vp2)
        tab = findViewById(R.id.tab_lab)
        button = findViewById(R.id.btn)

        viewPager.adapter = VpAdapter(this, List.list)
        TabLayoutMediator(tab, viewPager) { _, _ -> }.attach()

        viewPager.unregisterOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    2 -> {
                        button.text = "Начать"
                    }
                    else -> {
                        button.text = "Далее"
                    }
                }
            }
        })
    }
    fun guide(view: View){
        when(viewPager.currentItem){
            2->startActivity(Intent(this,SignUpActivity::class.java))
            else->viewPager.currentItem++
        }
    }
}