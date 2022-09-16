package com.example.springcore

import com.example.springcore.discount.FixDiscountPolicy
import com.example.springcore.members.InMemoryMemberRepository
import com.example.springcore.members.MemberService
import com.example.springcore.members.MemberServiceImpl
import com.example.springcore.orders.OrderService
import com.example.springcore.orders.OrderServiceImpl

class AppConfig {

    fun memberService(): MemberService {
        return MemberServiceImpl(InMemoryMemberRepository())
    }

    fun orderService(): OrderService {
        return OrderServiceImpl(InMemoryMemberRepository(), FixDiscountPolicy())
    }
}