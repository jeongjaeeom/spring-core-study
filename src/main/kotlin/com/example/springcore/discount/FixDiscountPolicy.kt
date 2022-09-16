package com.example.springcore.discount

import com.example.springcore.members.Grade
import com.example.springcore.members.Member

class FixDiscountPolicy : DiscountPolicy {

    override fun discount(member: Member, price: Int): Int {
        if (member.grade == Grade.VIP) {
            return 1000
        }
        return 0
    }
}