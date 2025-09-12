package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy.name
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
            week02Variables()
        }
    }

    private fun println(greet: String, s: String) {

    }

    private fun week02Variables() {
        println("Week 02: Function")

        fun greet(name: String) = "Hello, $name!"

        println(greet(name = :"Android developer"))

        println("==Kotlin Function==")

        fun greet(name: String: String): String{
            return "Hello, $name!"
        }
        fun add(a: Int, b: Int) = a + b
        fun introduce(name: String, age: Int=19){
            println("My name is $name and I'm 19 years old")
        }
        println(greet(name = "Kotlin"))

        println("Sum: ${add(a:5, b:-71)}")
    }


    private fun week02Variables() {
        //println("Week 02: Variables")

        //val courseName = "Mobile Programming"
        //var week = 1
        //var week = 2
        //println("Course : $courseName")
        //println("Week : $week")


        println("== Kotlin Variables == ")

        // val(immutable) vs var(mutable)
        val name = "Android"
        var version = 8.1

        println("Hello $name $version")

        val age : Int = 24
        val height: Double = 177.7
        val isStudent: Boolean = false

        println("Age: $age, Height: $height, Student: $isStudent")

        //var nickname: String = null
        var nickname: String? = null
        nickname = "mirae"
        println("Nickname: $nickname ${nickname?.length}")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}