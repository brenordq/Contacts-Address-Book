/*
 * Name: Breanna Gonzalez
 * Date: 11/15/2026
 * Assignment: Contacts Address Book
 * Description: Displays two contacts and allows
 * users to view their individual contact details.
 */

package com.example.bregonzalez_contactsaddressbook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alexButton =
            findViewById<Button>(R.id.alexDetailsButton)

        val averyButton =
            findViewById<Button>(R.id.averyDetailsButton)

        alexButton.setOnClickListener {
            val intent = Intent(
                this,
                Contact1Activity::class.java
            )
            startActivity(intent)
        }

        averyButton.setOnClickListener {
            val intent = Intent(
                this,
                Contact2Activity::class.java
            )
            startActivity(intent)
        }
    }
}

