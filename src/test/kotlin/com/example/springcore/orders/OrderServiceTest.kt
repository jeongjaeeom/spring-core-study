package com.example.springcore.orders

import com.example.springcore.AppConfig
import com.example.springcore.members.Grade
import com.example.springcore.members.Member
import com.example.springcore.members.MemberService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class OrderServiceTest {

    private lateinit var memberService: MemberService
    private lateinit var orderService: OrderService

    @BeforeEach
    internal fun setUp() {
        val appConfig = AppConfig()
        memberService = appConfig.memberService()
        orderService = appConfig.orderService()
    }

    @Test
    fun createOrder() {
        // given
        val memberId = 1L
        val member = Member(memberId, "memberA", Grade.VIP)

        // when
        memberService.join(member)
        val order = orderService.createOrder(memberId, "itemA", 10000)

        // then
        Assertions.assertThat(order.discountPrice).isEqualTo(1000)
    }
}