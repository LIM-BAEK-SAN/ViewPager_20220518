package kr.nepp.viewpager_20220518

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.nepp.fragment_20220518.adapters.MainViewPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {

        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mAdapter

//        재사용성 억제 > 한번 만들어둔 프래그먼트들을 유지

        mainViewPager.offscreenPageLimit = 3
    }
}