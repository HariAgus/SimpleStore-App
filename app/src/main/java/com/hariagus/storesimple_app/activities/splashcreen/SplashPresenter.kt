package com.hariagus.storesimple_app.activities.splashcreen

import android.os.Handler

class SplashPresenter(val view: SplashView) {

    fun startTimer(interval: Long) {
        val handler = Handler()
        handler.postDelayed(Runnable {
            view.navigateToIntroView()
        }, interval)
    }

}