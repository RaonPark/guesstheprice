package com.raonpark.guesstheprice.vo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Identity identity;
}
