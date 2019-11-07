package com.mkeeda.composetutorial

import androidx.annotation.DrawableRes

data class NewsItem(
    val title: String,
    val author: String,
    val date: String,
    @DrawableRes val imageId: Int
)

val sampleNewsItems = listOf(
    NewsItem(
        title = "Now in Android #7",
        author = "Chet Haase",
        date = "Nov 1",
        imageId = R.drawable.now_in_android
    ),
    NewsItem(
        title = "Dependency Injection Guidance on Android — ADS 2019",
        author = "Manuel Vivo",
        date = "Nov 7",
        imageId = R.drawable.dependency_injection_guidance_on_android
    ),
    NewsItem(
        title = "Gesture Navigation: Handling gesture conflicts (III)",
        author = "Chris Banes",
        date = "Oct 17",
        imageId = R.drawable.gesture_navigation_handling_gesture_conflicts_iii
    )
)

