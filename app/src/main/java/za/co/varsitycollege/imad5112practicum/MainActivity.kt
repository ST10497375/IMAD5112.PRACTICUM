package za.co.varsitycollege.imad5112practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


//GRACIE ANTUF, ST10497375 IMAD PRACTICUM

//all variables and arrays used
    val recipes = arrayOf("Blueberry Pancakes, Omelette, Fruit Salad, Stir-fried Rice")
        for (recipe in recipes) {
            println(recipe)
        }

    val txeRecimeTextView = findViewById<TextView>(R.id.txeRecimeTextView)
    val txeNameEditText = findViewById<EditText>(R.id.txeNameEditText)
    val txeCategoryEditText = findViewById<EditText>(R.id.txeCategoryEditText)
    val txeRatingEditText = findViewById<EditText>(R.id.txeRatingEditText)
    val txeIngredientsEditText = findViewById<EditText>(R.id.txeIngredientsEditText)
    val btnViewButton = findViewById<Button>(R.id.btnViewButton)
    val btnExitButton = findViewById<Button>(R.id.btnExitButton)

        btnViewButton.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            startActivity(intent)

            val recipe = txeNameEditText.text.toString()
            val category = txeCategoryEditText.text.toString()
            val rating = txeRatingEditText.text.toString()
            val ingredients = txeIngredientsEditText.text.toString()

            //error handling
            if (recipe.isEmpty() || category.isEmpty() || rating.isEmpty() || ingredients.isEmpty())
                Toast.makeText(this, "Please input the following to continue", Toast.LENGTH_SHORT)
                    .show()
            else{
                return@setOnClickListener
            }


        }




        }



    }
