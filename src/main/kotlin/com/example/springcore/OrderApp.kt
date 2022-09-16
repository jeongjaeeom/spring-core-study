package com.example.springcore

import com.example.springcore.members.Grade
import com.example.springcore.members.Member
import com.example.springcore.members.MemberServiceImpl
import com.example.springcore.orders.OrderServiceImpl

fun main(args: Array<String>) {
    val memberService = MemberServiceImpl()
    val orderService = OrderServiceImpl()

    val memberId = 1L
    val member = Member(memberId, "memberA", Grade.VIP)
    memberService.join(member)

    val order = orderService.createOrder(memberId, "itemA", 10000)
    println("order = $order")
    println("calculatePrice = ${order.calculatePrice()}")
}