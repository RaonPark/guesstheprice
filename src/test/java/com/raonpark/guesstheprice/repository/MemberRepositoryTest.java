package com.raonpark.guesstheprice.repository;

import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import com.raonpark.guesstheprice.vo.Identity;
import com.raonpark.guesstheprice.vo.Member;

import static org.mockito.Mockito.*;

@SpringBootTest
public class MemberRepositoryTest {
    @Mock
    private MemberRepository memberRepository;

    void register() {
        // given
        Member member = Member.builder()
            .id(1L)
            .username("raonpark")
            .password("1234")
            .identity(Identity.ADMIN)
            .build();

        // when
        memberRepository.save(member);

        // then
        when(memberRepository.findByUsername("raonpark").thenReturn(member);

    }
}
