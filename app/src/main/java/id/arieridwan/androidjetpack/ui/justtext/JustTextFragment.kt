package id.arieridwan.androidjetpack.ui.justtext

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import id.arieridwan.androidjetpack.R
import kotlinx.android.synthetic.main.just_text_fragment.*

class JustTextFragment : Fragment() {

    private val TAG = "JustTextFragment"
    private lateinit var mViewModel: JustTextViewModel

    companion object {
        fun newInstance() = JustTextFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.just_text_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(JustTextViewModel::class.java)
        mViewModel.justText.observe(this, Observer { text -> text?.let { printJustText(it) } })
        view?.findViewById<Button>(R.id.btn_next_text)?.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_textPage_to_timerPage, null)
        )
    }

    private fun printJustText(text : String) {
        tv_title.append("\n" + text)
        Log.d(TAG, text)
    }

}
