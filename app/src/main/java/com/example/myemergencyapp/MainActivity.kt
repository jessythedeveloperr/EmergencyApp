package com.example.myemergencyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

data class EmergencyContact(val name: String, val phoneNumber: String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scanner = Scanner(System.`in`)
        val contact = getEmergencyContact(scanner)

        println("Emergency Application")
        println("---------------------")
        println("Please enter your emergency contact information:")
        println("Name:")
        val name = scanner.nextLine()
        println("Phone number:")
        val phoneNumber = scanner.nextLine()

        val emergencyContact = EmergencyContact(name, phoneNumber)
        println("Emergency contact information saved:")
        println("Name: ${emergencyContact.name}")
        println("Phone number: ${emergencyContact.phoneNumber}")

        println("Press 'a' to activate distress signal:")
        val input = scanner.nextLine()
        if (input.toLowerCase() == "a") {
            activateDistressSignal(emergencyContact)
        }

        scanner.close()
    }

    private fun getEmergencyContact(scanner: Scanner): EmergencyContact {
        println("Enter your pre-configured emergency contact information:")
        println("Name:")
        val name = scanner.nextLine()
        println("Phone number:")
        val phoneNumber = scanner.nextLine()

        return EmergencyContact(name, phoneNumber)
    }

    private fun activateDistressSignal(emergencyContact: EmergencyContact) {
        println("Distress signal activated!")
        println("Sending distress signal to ${emergencyContact.name} at ${emergencyContact.phoneNumber}")
        // Send distress signal logic here
    }
}
