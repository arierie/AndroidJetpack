package id.arieridwan.androidjetpack.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.arieridwan.androidjetpack.R
import id.arieridwan.androidjetpack.utils.Constants.Companion.TEXT_PAGE
import id.arieridwan.androidjetpack.utils.Constants.Companion.TIMER_PAGE
import id.arieridwan.androidjetpack.utils.PageHelper.Companion.navigatePage
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    private lateinit var mViewModel: MainViewModel

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        btn_page_text.setOnClickListener({ context?.let { navigatePage(it, TEXT_PAGE) } })
        btn_page_timer.setOnClickListener({ context?.let { navigatePage(it, TIMER_PAGE) } })
    }

}
