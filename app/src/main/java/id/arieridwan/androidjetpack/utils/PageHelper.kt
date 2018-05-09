package id.arieridwan.androidjetpack.utils

import android.content.Context
import android.content.Intent
import id.arieridwan.androidjetpack.ui.justtext.JustTextActivity
import id.arieridwan.androidjetpack.ui.main.MainActivity
import id.arieridwan.androidjetpack.ui.timer.TimerActivity

class PageHelper {

    companion object {
        fun navigatePage(context: Context, page: Int) {
            var intent: Intent
            when (page) {
                Constants.MAIN_PAGE -> {
                    intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                }
                Constants.TEXT_PAGE -> {
                    intent = Intent(context, JustTextActivity::class.java)
                    context.startActivity(intent)
                }
                Constants.TIMER_PAGE -> {
                    intent = Intent(context, TimerActivity::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }

}