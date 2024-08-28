@file:Suppress("UNUSED_EXPRESSION")

package com.example.whatsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.Search -> {
                showToast("You clicked Camera!")
                true
            }
            R.id.qr_code -> {
                showToast("You clicked Camera!")
                true
            }
            R.id.new_group -> {
                showToast("You clicked new_group!")
                true
            }
            R.id.new_broadcast -> {
                showToast("You clicked new_broadcast!")
                true
            }
            R.id.Link_devices -> {
                showToast("You clicked Link_devices!")
                true
            }
            R.id.Stsrred_messages -> {
                showToast("You clicked Stsrred_messages!")
                true
            }
            R.id.Payments -> {
                showToast("You clicked Payments!")
                true
            }
            R.id.Setting -> {
                showToast("You clicked Setting!")
                true
            }
            R.id.Switch_accounts -> {
                showToast("You clicked Switch_accounts!")
                true
            }
            R.id.share -> {
                showToast("You clicked Share!")
                true
            }
            R.id.face_book -> {
                showToast("You clicked Whatsapp!")
                true
            }
            R.id.instagram -> {
                showToast("You clicked Instagram!")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()







    }
}
