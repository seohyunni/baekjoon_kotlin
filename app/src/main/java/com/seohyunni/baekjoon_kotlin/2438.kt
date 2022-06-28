package com.seohyunni.baekjoon_kotlin

//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n:Int = nextInt()

    for(i in 1..n){
        for(j in 1..i)
            print("*")
        println("")
    }
}