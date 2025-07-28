package za.co.varsitycollege.imad5112practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class DetailedView : AppCompatActivity() {
    lateinit var RecipeNames: ArrayList<String>
    lateinit var RecipeIngredients: ArrayList<String>
    lateinit var RecipeCategory: ArrayList<String>
    lateinit var RecipeRatings: FloatArray
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        RecipeNames = intent.getStringArrayListExtra("Names") ?: arrayListOf()
        RecipeIngredients = intent.getStringArrayListExtra("ingredients") ?: arrayListOf()
        RecipeRatings = intent.getFloatArrayExtra("ratings") ?: floatArrayOf()

    val txeRecipeTextView = findViewById<TextView>(R.id.txeRecipeTextView)
    val btnAverageButton = findViewById<Button>(R.id.BtnAverageButton)
    val btnReturnButton = findViewById<Button>(R.id.btnReturnButton)
    val txeRatingsTextView = findViewById<TextView>(R.id.txeRatingsTextView)

        txeRecipeTextView.text = txeRatingsTextView.toString()

      val displayText = StringBuilder()
        for(i in RecipeNames.indices) {
            txeRecipeTextView.append(" ${RecipeNames[i]}\n ${RecipeIngredients[i]}\n ${RecipeCategory[i]}\n")
        }
        txeRecipeTextView.text = displayText.toString()

        btnReturnButton.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnAverageButton.setOnClickListener {
            txeRatingsTextView.text
            }
        }












    }


