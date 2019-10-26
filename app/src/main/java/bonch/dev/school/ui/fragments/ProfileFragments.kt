package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import bonch.dev.school.R


class ProfileFragments : DialogFragment(){
    override fun onCreateView(
                inflater: LayoutInflater,
                 container: ViewGroup?,
                 savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container,false)

        return view

    }
}