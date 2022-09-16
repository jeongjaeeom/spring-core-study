package com.example.springcore

import com.example.springcore.members.Grade
import com.example.springcore.members.Member
import com.example.springcore.members.MemberServiceImpl

fun main(args: Array<String>) {
    val memberService = MemberServiceImpl()
    val member = Member(1L, "memberA", Grade.VIP)
    memberService.join(member)

    val findMember = memberService.findMember(1L)
    println("new member = ${member.name}")
    println("find member = ${findMember.name}")
}