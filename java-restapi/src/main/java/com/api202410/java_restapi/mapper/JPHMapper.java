package com.api202410.java_restapi.mapper;

import com.api202410.java_restapi.entity.UserEntity;
import com.api202410.java_restapi.model.User;

public class JPHMapper {

  public static UserEntity map(User user) {
    return UserEntity.builder()//
        .id(Long.valueOf(user.getId()))//
        .name(user.getName())//
        .username(user.getUsername())//
        .email(user.getEmail())//
        .phone(user.getPhone())//
        .website(user.getWebsite())//
        .build();
  }
}
