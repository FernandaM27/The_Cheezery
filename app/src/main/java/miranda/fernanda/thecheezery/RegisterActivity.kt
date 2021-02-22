package miranda.fernanda.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val button: Button = findViewById(R.id.button_sing_in) as Button

        button.setOnClickListener {
            var intent:Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}
}