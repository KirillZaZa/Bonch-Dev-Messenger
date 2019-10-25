package bonch.dev.school.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import bonch.dev.school.R
import bonch.dev.school.UI.activities.SignInActivity
import bonch.dev.school.ui.activities.SignUpActivity

class ProfileFragments : DialogFragment(){
    private lateinit var signOutButton: Button
    override fun onCreateView(
                inflater: LayoutInflater,
                 container: ViewGroup?,
                 savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container,false)
        signOutButton =  view.findViewById(R.id.sign_out_button)
        signOutButton.setOnClickListener{
            //выйти из профиля
        }
        return view

    }
}