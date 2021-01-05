package com.hariagus.storesimple_app.activities.splashcreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hariagus.storesimple_app.R
import com.hariagus.storesimple_app.activities.intro.IntroActivity
import org.jetbrains.anko.startActivity

class SplashScreenActivity : AppCompatActivity(), SplashView {

    private lateinit var presenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        presenter = SplashPresenter(this)
        presenter.startTimer(2000)

    }

    override fun navigateToIntroView() {
        startActivity<IntroActivity>()
        finish()
    }
}