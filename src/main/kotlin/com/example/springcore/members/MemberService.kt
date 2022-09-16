package com.example.springcore.members

interface MemberService {

    fun join(member: Member)

    fun findMember(memberId: Long): Member
}