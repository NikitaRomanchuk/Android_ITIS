package com.example.firsttask

class Child : SecondActivity(), MyAge {
    private fun main(name: String, age: Int?) {
        val secondName = name
        print(secondName)
    }

    override fun tempAge() {
        val tempAge = age
        if (tempAge != null) {
            defaultAge(tempAge)
        }
    }
}