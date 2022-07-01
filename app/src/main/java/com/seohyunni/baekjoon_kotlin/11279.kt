package com.seohyunni.baekjoon_kotlin

//널리 잘 알려진 자료구조 중 최대 힙이 있다. 최대 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.

//배열에 자연수 x를 넣는다.
//배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.

//프로그램은 처음에 비어있는 배열에서 시작하게 된다.

//입력 : 첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
//만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 입력되는 자연수는 231보다 작다.

//출력 : 입력에서 0이 주어진 회수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 큰 값을 출력하라고 한 경우에는 0을 출력하면 된다.

//내 풀이... 시간제한 타임아웃
import java.util.Scanner
import java.util.*

fun main() = with(Scanner(System.`in`)){
    val c = nextInt()
    val queue = PriorityQueue<Int>()

    for(i in 0 until c) {
        val x = nextInt()

        if(x>0){
            queue.add(x)
        } else if(x == 0){
            if(queue.isEmpty()){
                println("0")
            } else{
                var max = 0
                for(j in 0 until queue.size){
                    if(x>queue.elementAt(j)){
                        max = x
                    } else{
                        max = queue.elementAt(j)
                    }
                }
                println(max)
            }
        }
    }
}

//답안
//import java.io.BufferedReader
//import java.io.BufferedWriter
//import java.io.InputStreamReader
//import java.io.OutputStreamWriter
//import java.lang.Math.pow
//import java.lang.NumberFormatException
//import java.util.*
//import kotlin.math.abs
//import kotlin.math.pow
//import kotlin.math.sqrt
//
//
//val br = BufferedReader(InputStreamReader(System.`in`))
//
//fun main()=with(br){
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//    val n = readLine()!!.toInt()
//    val maxHeap = PriorityQueue<Int>(compareByDescending { it })
//    for(i in 0 until n){
//        val a = readLine()!!.toInt()
//        if(a==0){
//            if(!maxHeap.isEmpty()){
//                bw.write("${maxHeap.poll()}\n")
//            }
//            else
//                bw.write("0\n")
//        }
//        else{
//            maxHeap.add(a)
//        }
//    }
//    bw.flush()
//    bw.close()
//}