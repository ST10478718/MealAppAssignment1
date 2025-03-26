package za.co.varsitycollege.st10478718.mealappassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnCheck = findViewById<Button>(R.id.btnCheck)
        val txtwelcome= findViewById<TextView>(R.id.txtwelcome)
        val txeTimeOfTheDay= findViewById<EditText>(R.id.txeTimeOfTheDay)
        val btnReset= findViewById<Button>(R.id.btnReset)

        //Reset to clear the previous action
        btnReset.setOnClickListener{
            txeTimeOfTheDay.text.clear()
            txtwelcome.text="Input  the time  "
        }
            btnCheck.setOnClickListener {
            val timeOfDayText: String = txeTimeOfTheDay.text.toString()

            //Check if time is empty
            if(timeOfDayText.isEmpty()){
                txtwelcome.text="Please enter the time of the day "
            }

            // When statement for time of the day
            // Meal suggestion

              val suggestions= when(timeOfDayText) {
                  "morning" -> "Suggestions for the morning:\nOvernight Oats\nAvocado toast\nBanana pancakes\nOmelet and toast"
                  "mid-morning snack" -> "Suggestions for mid-morning snack:\nMuffins\nSmoothies\nSalad\nBaked chicken fingers"
                  "afternoon" -> "Suggestions for afternoon:\nTurkey Sandwich\nClassic peanut and Jelly Sandwich\nLoaded Bagel Sandwich\nAvocado toast with eggs"
                  "afternoon snack" -> "Suggestions for afternoon snack:\nFruit\nRaisins and nuts\nPopcorn\nYogurt"
                  "dinner" -> "Suggestions for dinner:\nChicken curry\nSpaghetti Bolognese\nMacaroni and cheese\nPepperoni pizza"
                  "after dinner" -> "Suggestions for after dinner:\nIce cream\nCookies\nCheesecake\nBrownies with ice cream"
                  else -> "Invalid time of the day.Please use Morning,Mid-Morning Snack, Afternoon,Afternoon snack, Dinner,After Dinner"
              }
                txtwelcome.text=suggestions
                }

            }
}



