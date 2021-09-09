package com.mlhysrszn.newsapp

import androidx.fragment.app.FragmentManager

const val NEWS = "news"

object Utils {

    private val businessNews1 = News(1, "Business1", "Business 1 Main Activity")
    private val businessNews2 = News(1, "Business2", "Business 2 Main Activity")
    private val businessNews3 = News(1, "Business3", "Business 3 Main Activity")
    private val business1 = BusinessNewsFragment.newInstance(businessNews1)
    private val business2 = BusinessNewsFragment.newInstance(businessNews2)
    private val business3 = BusinessNewsFragment.newInstance(businessNews3)

    private val scienceNews1 = News(1, "Science1", "Science 1 Main Activity")
    private val scienceNews2 = News(1, "Science2", "Science 2 Main Activity")
    private val scienceNews3 = News(1, "Science3", "Science 3 Main Activity")
    private val science1 = ScienceNewsFragment.newInstance(scienceNews1)
    private val science2 = ScienceNewsFragment.newInstance(scienceNews2)
    private val science3 = ScienceNewsFragment.newInstance(scienceNews3)

    private val techNews1 = News(1, "Technology1", "Technology 1 Main Activity")
    private val techNews2 = News(1, "Technology2", "Technology 2 Main Activity")
    private val techNews3 = News(1, "Technology3", "Technology 3 Main Activity")
    private val tech1 = TechnologyNewsFragment.newInstance(techNews1)
    private val tech2 = TechnologyNewsFragment.newInstance(techNews2)
    private val tech3 = TechnologyNewsFragment.newInstance(techNews3)

    fun removeFragments(fm: FragmentManager) {
        fm.beginTransaction().remove(business1).commit()
        fm.beginTransaction().remove(business2).commit()
        fm.beginTransaction().remove(business3).commit()
        fm.beginTransaction().remove(science1).commit()
        fm.beginTransaction().remove(science2).commit()
        fm.beginTransaction().remove(science3).commit()
        fm.beginTransaction().remove(tech1).commit()
        fm.beginTransaction().remove(tech2).commit()
        fm.beginTransaction().remove(tech3).commit()
    }

    fun addFragments(fm: FragmentManager) {
        fm.beginTransaction().add(R.id.frag1, business1).commit()
        fm.beginTransaction().add(R.id.frag2, science1).commit()
        fm.beginTransaction().add(R.id.frag3, tech1).commit()
        fm.beginTransaction().add(R.id.frag4, business2).commit()
        fm.beginTransaction().add(R.id.frag5, science2).commit()
        fm.beginTransaction().add(R.id.frag6, tech2).commit()
        fm.beginTransaction().add(R.id.frag7, business3).commit()
        fm.beginTransaction().add(R.id.frag8, science3).commit()
        fm.beginTransaction().add(R.id.frag9, tech3).commit()
    }
}