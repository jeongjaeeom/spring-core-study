package com.example.springcore.discount

import com.example.springcore.members.Grade
import com.example.springcore.members.Member

class RateDiscountPolicy : DiscountPolicy {

    private val discountPolicy: Int = 10

    override fun discount(member: Member, price: Int): Int {
        if (member.grade == Grade.VIP) {
            return price * discountPolicy / 100
        }
        return 0
    }
}