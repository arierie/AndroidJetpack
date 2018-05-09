package id.arieridwan.androidjetpack.ui.justtext

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class JustTextViewModel : ViewModel() {

    private val mJustText = MutableLiveData<String>()

    val justText: LiveData<String> get() = mJustText

    init {
        mJustText.value = "Hello, Jetpack!"
    }

}
