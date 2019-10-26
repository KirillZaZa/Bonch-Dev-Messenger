package bonch.dev.school.UI.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import bonch.dev.school.R
import bonch.dev.school.ui.activities.MainAppActivity
import bonch.dev.school.ui.activities.SignUpActivity
import kotlinx.android.synthetic.main.sign_in_activity.*

class SignInActivity : AppCompatActivity() {
    private lateinit var signInButton: Button
    private lateinit var signUpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_activity)

        signInButton = findViewById(R.id.sign_in_button)
        signUpButton = findViewById(R.id.sign_up_button)

        signInButton.setOnClickListener {
            val intent = Intent(
                 this@SignInActivity,
                MainAppActivity::class.java
            )
            startActivity(intent)
        }
        signUpButton.setOnClickListener{
            val intent = Intent(this@SignInActivity,
                SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
