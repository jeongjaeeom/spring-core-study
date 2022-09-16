package com.example.springcore.discount

import com.example.springcore.members.Grade
import com.example.springcore.members.Member
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateDiscountPolicyTest {

    private val discountPolicy = RateDiscountPolicy()

    @Test
    fun `VIP는 10% 할인이 적용되어야 한다`() {
        // given
        val member = Member(1L, "memberA", Grade.VIP)

        // when
        val discountPrice = discountPolicy.discount(member, 10000)

        // then
        assertThat(discountPrice).isEqualTo(1000)
    }

    @Test
    fun `VIP는 아니면 할인이 적용되지 않아야 한다`() {
        // given
        val member = Member(1L, "memberA", Grade.BASIC)

        // when
        val discountPrice = discountPolicy.discount(member, 10000)

        // then
        assertThat(discountPrice).isEqualTo(0)
    }
}