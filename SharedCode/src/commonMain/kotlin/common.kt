package com.example.syntaxios

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}