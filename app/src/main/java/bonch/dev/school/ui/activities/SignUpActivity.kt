package bonch.dev.school.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import bonch.dev.school.R

class SignUpActivity: AppCompatActivity() {
    // Активити регистрации
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_activity)
        initializeViews()
        setListeners()
    }

    private fun initializeViews(){
        signUpButton = findViewById(R.id.complete_sign_up_button)
    }

    private fun setListeners(){
        signUpButton.setOnClickListener{
            val intent = Intent(
                this@SignUpActivity,
                MainAppActivity::class.java
            )
            startActivity(intent)
        }
    }



}