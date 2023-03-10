package com.raonpark.guesstheprice.service;

import com.raonpark.guesstheprice.vo.Member;

public interface MemberService {
    String login(Member member);
    String register(Member member);
    void logout();
}
