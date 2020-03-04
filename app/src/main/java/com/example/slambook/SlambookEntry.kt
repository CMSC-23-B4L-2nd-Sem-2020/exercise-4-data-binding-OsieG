package com.example.slambook

data class SlambookEntry( var name_text: String= "", var nickname: String= "", var age: String= ""
                          , var birthday: String= "", var phone: String= "", var email: String= ""
                          , var course: String= "", var dream: String= "", var crush: String=""
                          , var message: String="",
                          var name_edit: String = "", var nickname_edit: String= "", var age_edit: String= ""
                          , var birthday_edit: String= "", var phone_edit: String= "", var email_edit: String= ""
                          , var course_edit: String= "", var dream_edit: String= "", var crush_edit: String= ""
                          , var message_edit: String= "")

//data class which holds various variables and called separately in the other kt file