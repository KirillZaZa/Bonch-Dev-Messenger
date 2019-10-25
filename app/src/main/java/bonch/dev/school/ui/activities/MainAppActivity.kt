package bonch.dev.school.ui.activities

import android.content.pm.ActivityInfo
import bonch.dev.school.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.ui.fragments.ChatFragments
import bonch.dev.school.ui.fragments.ProfileFragments

class MainAppActivity : AppCompatActivity() {

    private val fragManager = supportFragmentManager

    //Жизненный цикл приложения(метод onCreate())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Какой макет используется
        fragManager.beginTransaction().add(R.id.fragment,ChatFragments())
            .commit()

    }

    fun replaceFragment(){
        fragManager.beginTransaction().add(R.id.fragment, ProfileFragments())
            .addToBackStack("thirdFragment")
            .commit()
    }
}
