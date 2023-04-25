package com.example.claimchapchap.sampleData

import com.example.claimchapchap.models.Users
import java.util.*


object SampleDataUsers {

    private val USERS = ArrayList<Users>()

    private var COUNT = 3

    private var dummy_description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce accumsan quis justo quis hendrerit. Curabitur a ante neque. Fusce nec mauris sodales, auctor sem at, luctus eros. Praesent aliquam nibh neque. Duis ut suscipit justo, id consectetur orci. Curabitur ultricies nunc eu enim dignissim, sed laoreet odio blandit."

    init {
        // Add some sample items
        val newUser1 = Users()
        newUser1.id = 1
        newUser1.firstName = "Tertius"
        newUser1.secondName = "Kabugi"
        newUser1.phoneNumber = "0794655918"
        newUser1.email = "kingkabugi@gmail.com"
        newUser1.password = "password"
        newUser1.cPassword = "password"
        USERS.add(newUser1)

        val newUser2 = Users()
        newUser2.id = 2
        newUser2.firstName = "Tertius"
        newUser2.secondName = "Kabugi"
        newUser2.phoneNumber = "0794655918"
        newUser2.email = "kingkabugi@gmail.com"
        newUser2.password = "password"
        newUser2.cPassword = "password"
        USERS.add(newUser2)

        val newUser3 = Users()
        newUser3.id = 3
        newUser3.firstName = "Tertius"
        newUser3.secondName = "Kabugi"
        newUser3.phoneNumber = "0794655918"
        newUser3.email = "kingkabugi@gmail.com"
        newUser3.password = "password"
        newUser3.cPassword = "password"
        USERS.add(newUser3)
    }

    fun addUser(item: Users) {
        item.id = COUNT
        USERS.add(item)
        COUNT += 1
    }

    fun getUserById(id: Int): Users? {
        for (i in USERS.indices) {
            if (USERS[i].id == id) {
                return USERS[i]
            }
        }

        return null
    }

    fun deleteUser(id: Int) {
        var userToRemove: Users? = null

        for (i in USERS.indices) {
            if (USERS[i].id == id) {
                userToRemove = USERS[i]
            }
        }

        if (userToRemove != null) {
            USERS.remove(userToRemove)
        }
    }

    fun updateUsers(user: Users) {
        for (i in USERS.indices) {
            if (USERS[i].id == user.id) {
                val userToUpdate = USERS[i]

                userToUpdate.firstName = user.firstName
                userToUpdate.secondName = user.secondName
                userToUpdate.email = user.email
                userToUpdate.phoneNumber = user.phoneNumber
                userToUpdate.password = user.password
                userToUpdate.cPassword = user.cPassword
            }
        }
    }
}