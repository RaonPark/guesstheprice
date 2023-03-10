package com.raonpark.guesstheprice.repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.raonpark.guesstheprice.vo.Member;

@Repository
public interface MemberRepository extends ElasticsearchRepository<Member, Long> {
    Member findByUsername(String name);
}
