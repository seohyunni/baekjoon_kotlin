package com.seohyunni.baekjoon_kotlin

//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val c: Int = nextInt()

    for(i in 0 until c){
        val n:Int = nextInt()
        var total = 0
        val scores = mutableListOf<Int>()

        for(j in 0 until n){
            val score = nextInt()
            total += score
            scores.add(score)
        }
        var average = 0
        average = total/n
        var count = 0
        var result = ""
        for(k in 0 until n){
            if(scores[k]>average){
                count++
            }
            result = String.format("%.3f",((count.toDouble()/n)*100))
        }

        println("$result%")
    }
}

//소숫점 아래 세 자리까지 출력이라고 double 타입으로 출력해야지 하고 toDouble()을 계속 썼는데 계속 소숫점이 0이면 소숫점 아래 한 자리까지만 나오길래 어떡하지...
//하다가 문득 그냥 String 타입으로 출력해도 되잖아?! 해서 한참 고민한 게 별 거 아니었다...
//배열 위치 잘못 써서 3번째부터 냅다 00.000으로 나와서 좀 울고 싶었지만 뒤늦게라도 알아서 다행입니다 (ㅋㅋ)