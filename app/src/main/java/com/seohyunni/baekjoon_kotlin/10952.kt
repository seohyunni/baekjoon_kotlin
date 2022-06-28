package com.seohyunni.baekjoon_kotlin

//두 정수 A와 B를 한 줄로 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//0 0이 입력되면 종료

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    while (true){
        val a:Int = nextInt()
        val b:Int = nextInt()

        if(a==0 && b==0){
            break
        }
        println(a+b)
    }
}