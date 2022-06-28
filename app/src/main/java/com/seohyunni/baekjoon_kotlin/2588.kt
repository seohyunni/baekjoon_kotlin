package com.seohyunni.baekjoon_kotlin
import java.util.Scanner

//자연수 3자리 a, b 입력받고 곱셈 과정 출력

fun main() = with(Scanner(System.`in`)){
    val a:Int = nextInt()
    val b:Int = nextInt()

    println(b%10*a)
    println(b/10%10*a)
    println(b/100*a)
    println(a*b)
}