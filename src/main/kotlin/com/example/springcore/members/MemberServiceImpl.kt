package com.example.springcore.members

class MemberServiceImpl(
    private val memberRepository: MemberRepository
) : MemberService {

    override fun join(member: Member) {
        memberRepository.store(member)
    }

    override fun findMember(memberId: Long): Member {
        return memberRepository.findById(memberId) ?: throw IllegalArgumentException()
    }
}