package com.example.springcore.orders

import com.example.springcore.members.Grade
import com.example.springcore.members.Member
import com.example.springcore.members.MemberServiceImpl
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class OrderServiceTest {

    private val memberService = MemberServiceImpl()
    private val orderService = OrderServiceImpl()

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