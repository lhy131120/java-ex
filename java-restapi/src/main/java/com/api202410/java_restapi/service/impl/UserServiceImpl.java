package com.api202410.java_restapi.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.api202410.java_restapi.infra.Scheme;
import com.api202410.java_restapi.infra.UrlManager;
import com.api202410.java_restapi.mapper.JPHMapper;
import com.api202410.java_restapi.model.User;
import com.api202410.java_restapi.repository.UserRepository;
import com.api202410.java_restapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  /*
   * @Value: Before
   */
  @Value("${api.url.domain}")
  private String domain;

  @Value("${api.url.endpoint.user}")
  private String endpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private UserRepository userRepository;

  @Override
  public User[] getUsers() {
    // Call API

    String url = UrlManager.builder()//
        .scheme(Scheme.HTTPS)//
        .domain(this.domain)//
        .endpoint(this.endpoint)//
        .build()//
        .toString();

    System.out.println("API URL: " + url);

    User[] users = this.restTemplate.getForObject(url, User[].class);

    /*
     * Save to user Array to DB
     */

    Arrays.asList(users).stream().forEach(user -> {
      userRepository.save(JPHMapper.map(user));
    });

    return users;
  }

}
