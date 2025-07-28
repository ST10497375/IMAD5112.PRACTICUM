package za.co.varsitycollege.imad5112practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

    val txeRecipeTextView = findViewById<TextView>(R.id.txeRecipeTextView)
    val btnAverageButton = findViewById<Button>(R.id.BtnAverageButton)
    val btnReturnButton = findViewById<Button>(R.id.btnReturnButton)

        btnReturnButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}

