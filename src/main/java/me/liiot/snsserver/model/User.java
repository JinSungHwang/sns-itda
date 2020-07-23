package me.liiot.snsserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

/*
@Getter
: 각 필드에 대한 접근자 메소드를 생성

@AllArgsConstructor
: 모든 필드 값을 파라미터로 받는 생성자 생성
 */
@Getter
@AllArgsConstructor
public class User {

    private final String userId;

    private final String password;

    private final String name;

    private final String phoneNumber;

    private final String email;

    private final Date birth;
}
