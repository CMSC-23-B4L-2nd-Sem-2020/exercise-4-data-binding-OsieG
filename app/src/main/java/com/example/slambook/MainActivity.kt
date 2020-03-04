package com.example.slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val name: SlambookEntry = SlambookEntry("Full Name", "Nickname"
    , "Age", "Birthday", "Phone", "Email", "Course", "Dream"
    , "Crush", "Message")                       //changing texts for corresponding tags

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.slambookData= name
        binding.sendButton.setOnClickListener{
            sendData(it)
        }
    }

    private fun sendData(view: View){
        binding.apply{                      //place values for the edits from the SlambookEntry kt with their corresponding values from the user
            slambookData?.name_edit= nameEdit.text.toString()
            slambookData?.nickname_edit= nicknameEdit.text.toString()
            slambookData?.age_edit= ageEdit.text.toString()
            slambookData?.birthday_edit= birthdayEdit.text.toString()
            slambookData?.phone_edit= numberEdit.text.toString()
            slambookData?.email_edit= emailEdit.text.toString()
            slambookData?.course_edit= courseEdit.text.toString()
            slambookData?.dream_edit= dreamEdit.text.toString()
            slambookData?.crush_edit= crushEdit.text.toString()
            slambookData?.message_edit= messageEdit.text.toString()

            invalidateAll()
            sendButton.visibility= View.GONE            //hides unnecessary fields and shows the result of each fields
            messageEdit.visibility= View.GONE
            messageText.visibility= View.GONE
            crushEdit.visibility= View.GONE
            crushText.visibility= View.GONE
            dreamEdit.visibility= View.GONE
            dreamText.visibility= View.GONE
            courseEdit.visibility= View.GONE
            courseText.visibility= View.GONE
            emailEdit.visibility= View.GONE
            emailText.visibility= View.GONE
            numberEdit.visibility= View.GONE
            numberText.visibility= View.GONE
            birthdayEdit.visibility= View.GONE
            birthdayText.visibility= View.GONE
            ageEdit.visibility= View.GONE
            ageText.visibility= View.GONE
            nicknameEdit.visibility= View.GONE
            nicknameText.visibility= View.GONE
            nameEdit.visibility= View.GONE
            nameText.visibility= View.GONE
            helloText.visibility= View.GONE
            nameHolder.visibility= View.VISIBLE
            nicknameHolder.visibility= View.VISIBLE
            ageHolder.visibility= View.VISIBLE
            birthdayHolder.visibility= View.VISIBLE
            phoneHolder.visibility= View.VISIBLE
            emailHolder.visibility= View.VISIBLE
            courseHolder.visibility= View.VISIBLE
            dreamHolder.visibility= View.VISIBLE
            crushHolder.visibility= View.VISIBLE
            messageHolder.visibility= View.VISIBLE
            messageConst.visibility= View.VISIBLE
        }
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
