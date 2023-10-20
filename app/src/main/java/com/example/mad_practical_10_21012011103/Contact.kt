package com.example.mad_practical_10_21012011103

import java.io.Serializable

class Contact(var id:String,
              var name:String,
              var emailid:String,
              var phoneno:String,
              var address:String,
              var latitude:Double,
              var longitude:Double):Serializable {
}