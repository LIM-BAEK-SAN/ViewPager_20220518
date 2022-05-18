package kr.nepp.fragment_20220518.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.nepp.viewpager_20220518.fragments.HelloFragment
import kr.nepp.viewpager_20220518.fragments.NameFragment
import kr.nepp.viewpager_20220518.fragments.PhoneNumFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm)
{

//    몇 장짜리 뷰페이저인지 정수를 리턴
    override fun getCount() = 3

//    각 위치에 맞는 Fragment 객체들을 리턴

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> NameFragment()
            1 -> PhoneNumFragment()
            else -> HelloFragment()
        }
    }
}