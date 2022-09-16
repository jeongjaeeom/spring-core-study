package com.example.springcore.members

import com.example.springcore.AppConfig
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MemberServiceTest {

    private lateinit var memberService: MemberService

    @BeforeEach
    internal fun setUp() {
        val appConfig = AppConfig()
        memberService = appConfig.memberService()
    }

    @Test
    internal fun join() {
        // given
        val member = Member(1L, "memberA", Grade.VIP)

        // when
        memberService.join(member)
        val findMember = memberService.findMember(1L)

        // then
        Assertions.assertThat(member).isEqualTo(findMember)
    }
}