package com.cheetah.kotlion

import java.lang.NumberFormatException

fun main() {
//    println(sum2(1, 2))
//    unit_func("songpengfei")
//    func_no_unit("june leo")
    //val 之都局部变量，不能修改
//    val a = 1;
//    val b: Int = 2;
//
//    println("a is $a , b is $b")
//
//    // var 可重新赋值的变量
//    var c = 3;
//    var d: Int = 4;
//
//    c = 5;
//    d = 6;
//
//    println("c is $c,d is $d")

//    var a = 1;
//    var b = 2;
//
//    println("a and b, max value is ${max2(a, b)}")

//    println(parseInt("1"))
//    var str: String? = parseString("song")
//    println(str?.length)


}


fun parseString(str: String): String? {
    if (str.equals("aaa")) {
        return str;
    }

    return null
}


fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
//        e.printStackTrace();
    }
    return null
}


fun max2(a: Int, b: Int) = if (a > b) a else b


fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}


fun func_no_unit(str: String) {
    println("i am $str")
}


fun unit_func(str: String): Unit {
    println("I am $str")
}

//a+b 推荐出返回int
fun sum2(a: Int, b: Int) = a + b;


fun sum(a: Int, b: Int): Int {
    return a + b;
}