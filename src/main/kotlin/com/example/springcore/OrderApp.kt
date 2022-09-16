package com.example.springcore

import com.example.springcore.members.Grade
import com.example.springcore.members.Member

fun main(args: Array<String>) {
    val appConfig = AppConfig()
    val memberService = appConfig.memberService()
    val orderService = appConfig.orderService()

    val memberId = 1L
    val member = Member(memberId, "memberA", Grade.VIP)
    memberService.join(member)

    val order = orderService.createOrder(memberId, "itemA", 10000)
    println("order = $order")
    println("calculatePrice = ${order.calculatePrice()}")
}