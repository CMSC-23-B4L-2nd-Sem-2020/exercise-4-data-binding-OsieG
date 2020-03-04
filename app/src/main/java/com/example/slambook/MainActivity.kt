package com.example.slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.slambook.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.sendButton.setOnClickListener{
            sendData(it)
        }
    }

    private fun sendData(view: View){
        binding.apply{
            slambookEntry?.name= name_edit.text.toString()

            sendButton.visibility= View.GONE
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
            messageConst.visibility= View.VISIBLE
        }
    }

}
