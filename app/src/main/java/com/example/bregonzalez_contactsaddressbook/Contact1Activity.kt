/*
 * Name: Breanna Gonzalez
 * Date: 11/15/2026
 * Assignment: Contacts Address Book
 * Description: Displays the contact information
 * for Alex Anderson.
 */

package com.example.bregonzalez_contactsaddressbook

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Contact1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_1)

        val backButton =
            findViewById<Button>(R.id.alexBackButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}
