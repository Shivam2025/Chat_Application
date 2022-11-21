package com.example.chatapplication


//we can use data class if we aqre just meant to store data values but to use it with firebase, empty constructors are needed
class User {
    var name:String?=null
    var email:String?=null
    var uid:String?=null

    constructor(){}

    constructor(name:String?, email:String?, uid:String?){
        this.name=name
        this.email=email
        this.uid=uid

    }
}