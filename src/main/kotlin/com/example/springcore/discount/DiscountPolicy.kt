package com.example.springcore.discount

import com.example.springcore.members.Member

interface DiscountPolicy {

    fun discount(member: Member, price: Int): Int
}