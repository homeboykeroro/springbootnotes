package com.example.springbootnotes.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springbootnotes.entity.QUser;
import com.example.springbootnotes.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepository {
    @Autowired
    private JPAQueryFactory queryFactory;

    QUser user = QUser.user;

    public List<User> getAllUser() {
        return
            this.queryFactory.selectFrom(user)
                             .fetch();
    }
}
