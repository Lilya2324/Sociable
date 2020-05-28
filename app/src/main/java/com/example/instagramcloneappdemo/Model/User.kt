package com.example.instagramcloneappdemo.Model

class User
{

    private var username: String = ""
    private var fullname: String = ""
    private var email: String = "" //!!!!!
    private var bio: String = ""
    private var image: String = ""
    private var uid: String = ""

    constructor()

    constructor(username: String, fullname: String, email: String, bio: String, image: String, uid: String)
    {

        this.username = username
        this.fullname = fullname
        this.email = email
        this.bio = bio
        this.image = image
        this.uid = uid

    }

    fun getUsername(): String
    {

        return username

    }

    fun setUsername(username: String)
    {

        this.username = username

    }

    fun getFullname(): String
    {

        return fullname

    }

    fun setFullname(fullname: String)
    {

        this.fullname = fullname

    }

    fun getEmail(): String
    {

        return email

    }

    fun setEmail(email: String)
    {

        this.email = email

    }

    fun getBio(): String
    {

        return bio

    }

    fun setBio(bio: String)
    {

        this.bio = bio

    }

    fun getImage(): String
    {

        return image

    }

    fun setImage(image: String)
    {

        this.image = image

    }

    fun getUID(): String
    {

        return uid

    }

    fun setUID(uid: String)
    {

        this.uid = uid

    }

}