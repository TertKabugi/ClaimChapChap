package com.example.claimchapchap.sampleData

import com.example.claimchapchap.models.Policies
import com.example.claimchapchap.models.Users
import java.util.*


object SampleDataPolicies {

    val POLICIES = ArrayList<Policies>()

    private var COUNT = 3

    private var dummy_description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce accumsan quis justo quis hendrerit. Curabitur a ante neque. Fusce nec mauris sodales, auctor sem at, luctus eros. Praesent aliquam nibh neque. Duis ut suscipit justo, id consectetur orci. Curabitur ultricies nunc eu enim dignissim, sed laoreet odio blandit."

    init {
        // Add some sample items
        val newPolicy1 = Policies()
        newPolicy1.id = 1
        newPolicy1.firstName = "Tertius"
        newPolicy1.secondName = "Kabugi"
        newPolicy1.dob = "01/01/2001"
        newPolicy1.nationalID = "01"
        newPolicy1.kraPin = "pin1"
        newPolicy1.phoneNumber = "0794655918"
        newPolicy1.driversLicenceNo = "01"
        newPolicy1.carMake = "Toyota"
        newPolicy1.carModel = "Prius"
        newPolicy1.yom = "01/01/2001"
        newPolicy1.dop = "01/01/2001"
        newPolicy1.carValuation = "1000000"
        newPolicy1.numberPlate = "AAA 001A"
        POLICIES.add(newPolicy1)

        val newPolicy2 = Policies()
        newPolicy2.id = 1
        newPolicy2.firstName = "John"
        newPolicy2.secondName = "Doe"
        newPolicy2.dob = "02/02/2002"
        newPolicy2.nationalID = "02"
        newPolicy2.kraPin = "pin2"
        newPolicy2.phoneNumber = "0794655918"
        newPolicy2.driversLicenceNo = "02"
        newPolicy2.carMake = "Mercedes"
        newPolicy2.carModel = "G63"
        newPolicy2.yom = "02/02/2002"
        newPolicy2.dop = "02/02/2002"
        newPolicy2.carValuation = "2000000"
        newPolicy2.numberPlate = "BBB 002B"
        POLICIES.add(newPolicy2)

        val newPolicy3 = Policies()
        newPolicy2.id = 1
        newPolicy2.firstName = "Kalvin"
        newPolicy2.secondName = "Osoro"
        newPolicy2.dob = "03/03/2003"
        newPolicy2.nationalID = "03"
        newPolicy2.kraPin = "pin3"
        newPolicy2.phoneNumber = "0794655918"
        newPolicy2.driversLicenceNo = "03"
        newPolicy2.carMake = "Subaru"
        newPolicy2.carModel = "Impreza"
        newPolicy2.yom = "03/03/2003"
        newPolicy2.dop = "03/03/2003"
        newPolicy2.carValuation = "3000000"
        newPolicy2.numberPlate = "CCC 003C"
        POLICIES.add(newPolicy3)
    }

    fun addPolicy(item: Policies) {
        item.id = COUNT
        POLICIES.add(item)
        COUNT += 1
    }

    fun getPolicyById(id: Int): Policies? {
        for (i in POLICIES.indices) {
            if (POLICIES[i].id == id) {
                return POLICIES[i]
            }
        }

        return null
    }

    fun deletePolicy(id: Int) {
        var userToRemove: Policies? = null

        for (i in POLICIES.indices) {
            if (POLICIES[i].id == id) {
                userToRemove = POLICIES[i]
            }
        }

        if (userToRemove != null) {
            POLICIES.remove(userToRemove)
        }
    }

//    fun updatePolicy(user: Policies) {
//        for (i in POLICIES.indices) {
//            if (POLICIES[i].id == user.id) {
//                val userToUpdate = POLICIES[i]
//
//                userToUpdate.firstName = user.firstName
//                userToUpdate.secondName = user.secondName
//                userToUpdate.email = user.email
//                userToUpdate.phoneNumber = user.phoneNumber
//                userToUpdate.password = user.password
//                userToUpdate.cPassword = user.cPassword
//            }
//        }
//    }
}