package com.cojar.market.member.Service;

import com.cojar.market.member.entity.Member;
import com.cojar.market.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public Member join(String username, String password, String email, String nickname) {

        Member member = new Member();
        member.setUsername(username);
        member.setPassword(password);
        member.setEmail(email);
        member.setNickname(nickname);
        memberRepository.save(member);

        return member;
    }
}