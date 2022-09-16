package com.example.springcore.members

import java.util.*

class InMemoryMemberRepository : MemberRepository {
    override fun store(member: Member) {
        store[member.id] = member
    }

    override fun findById(id: Long): Member? {
        return store[id]
    }

    companion object {
        private val store: MutableMap<Long, Member> = HashMap()
    }
}