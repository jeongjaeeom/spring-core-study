package com.example.springcore.orders

import com.example.springcore.discount.FixDiscountPolicy
import com.example.springcore.members.InMemoryMemberRepository
import com.example.springcore.members.MemberRepository

class OrderServiceImpl : OrderService {

    private val memberRepository = InMemoryMemberRepository()
    private val discountPolicy = FixDiscountPolicy()

    override fun createOrder(memberId: Long, itemName: String, itemPrice: Int): Order {
        val member = memberRepository.findById(memberId) ?: throw IllegalArgumentException()
        val discountPrice = discountPolicy.discount(member, itemPrice)

        return Order(memberId, itemName, itemPrice, discountPrice)
    }
}