package com.example.springcore.members

interface MemberRepository {

    fun store(member: Member)

    fun findById(id: Long): Member?

}