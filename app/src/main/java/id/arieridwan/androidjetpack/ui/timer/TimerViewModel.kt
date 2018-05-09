package id.arieridwan.androidjetpack.ui.timer

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.os.SystemClock
import id.arieridwan.androidjetpack.utils.Constants
import java.util.*

class TimerViewModel : ViewModel() {

    private var mInitialTime: Long = 0
    private val mElapsedTime = MutableLiveData<Long>()

    init {
        mInitialTime = SystemClock.elapsedRealtime()
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                val newValue = (SystemClock.elapsedRealtime() - mInitialTime) / 1000
                mElapsedTime.postValue(newValue)
            }
        }, Constants.ONE_SECOND.toLong(), Constants.ONE_SECOND.toLong())

    }

    fun getElapsedTime(): LiveData<Long> {
        return mElapsedTime
    }

}
