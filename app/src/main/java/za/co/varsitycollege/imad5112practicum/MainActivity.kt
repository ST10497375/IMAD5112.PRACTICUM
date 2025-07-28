package za.co.varsitycollege.imad5112practicum

import android.content.Context
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
    var RecipeNames = ArrayList<String>()
    var RecipeIngredients = ArrayList<String>()
    var RecipeRatings = ArrayList<String>()
    var RecipeCategory = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//GRACIE ANTUF, ST10497375 IMAD PRACTICUM

//all variables and arrays used
        val recipe = arrayOf("recipe", "category", "rating", "ingredients")

        val txeRecimeTextView = findViewById<TextView>(R.id.txeRecimeTextView)
        val txeNameEditText = findViewById<EditText>(R.id.txeNameEditText)
        val txeCategoryEditText = findViewById<EditText>(R.id.txeCategoryEditText)
        val txeRatingEditText = findViewById<EditText>(R.id.txeRatingEditText)
        val txeIngredientsEditText = findViewById<EditText>(R.id.txeIngredientsEditText)

        val btnViewButton = findViewById<Button>(R.id.btnViewButton)
        val btnExitButton = findViewById<Button>(R.id.btnExitButton)
        val btnAddButton = findViewById<Button>(R.id.btnAddButton)

        RecipeNames.add("Blueberry Pancakes")
        RecipeIngredients.add("Flour, Milk, Eggs, Sugar, Baking Powder")
        RecipeCategory.add("breakfast")
        RecipeRatings.add("8/10")

        RecipeNames.add("Omelette")
        RecipeIngredients.add("Eggs, Milk, Salt, Cut green onions")
        RecipeCategory.add("Lunch")
        RecipeRatings.add("7/10")

        RecipeNames.add("Fruit Salad")
        RecipeCategory.add("Light snack")
        RecipeIngredients.add("apples, bananas, kiwi, watermelon, all sliced")
        RecipeRatings.add("8.5/10")

        RecipeNames.add("Stir fry")
        RecipeIngredients.add("cooked rice, cooking oil, cut up vegetables of choice")
        RecipeCategory.add("Dinner")
        RecipeRatings.add("10/10")

        btnAddButton.setOnClickListener {
            val recipe = txeNameEditText.text.toString()
            val category = txeCategoryEditText.text.toString()
            val rating = txeRatingEditText.text.toString()
            val ingredients = txeIngredientsEditText.text.toString()


            //error handling
            if (recipe.isEmpty() || category.isEmpty() || rating.isEmpty() || ingredients.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT)
                return@setOnClickListener

                RecipeNames.add(recipe)
                RecipeRatings.add(rating)
                RecipeIngredients.add(ingredients)
                txeNameEditText.text.clear()
                txeRatingEditText.text.clear()
                txeCategoryEditText.text.clear()
                txeIngredientsEditText.text.clear()
            }
            btnExitButton.setOnClickListener {
                finishAffinity()
            }



            btnViewButton.setOnClickListener {
                val intent = Intent(this, DetailedView::class.java)
                intent.putStringArrayListExtra("names", RecipeNames)
                intent.putStringArrayListExtra("ingredients", RecipeIngredients)
                intent.putStringArrayListExtra("ratings", RecipeRatings)
                intent.putExtra("category", RecipeCategory)
                startActivity(intent)

            }


        }
    }

}











