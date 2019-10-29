package com.tjoeun.a20191029_kotlin_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("코틀린기초", "Hello World!")
        Log.d("코틀린기초", "My name is Kim Kibaek")
        Log.d("코틀린기초", "Good Bye~!!")

        var num1 = 10
        Log.d("코틀린기초",String.format("%d",num1))
        //Log는 내용이 반드시 String 이어야함. num1은 자동으로 Int로 할당되어서 내용으로 직접 들어갈 수 없다.

        val Pi = 3.14
        // Pi = 31.4 => val로 만든 상수값은 수정이 불가하다
        Log.d("코틀린기초",String.format("%f",Pi))

        var num2:Int
        num2 = 20 // 미리 타입을 지정해두면 해당 타입의 값을 나중에 대입 가능
        // num2 = 3.14 =>타입이 다른값은 지정할 수 없다
        Log.d("코틀린기초",String.format("%d",num2))

        var num3:Int
        //Log.d("코틀린기초",String.format("%d",num3)) => 초기화 안된 변수는 아예 사용도 못하게 Compile 에서 막는다

        num2 = num2.plus(10)
        Log.d("코틀린기초",String.format("%d",num2))
        //코틀린에서는 모든 변수가 참조형 변수이므로 Int같은 기본형으로 추정되는 변수도 기본 메소드와 속성을 보유하고 있다

        var num4:Int? = null
        // ?를 붙이면 이 변수는 null일 가능성을 내포하고 있다고 알려주는 역할
        // ?를 붙이지 않은 변수는 null을 담기를 거부함
        // var num5 = null => 애초에 null로 초기화 하는것은 가능 => type이 지정되지 않은 상태로 유지

    }
}
