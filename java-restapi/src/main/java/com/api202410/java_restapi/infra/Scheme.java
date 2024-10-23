package com.api202410.java_restapi.infra;

import lombok.Getter;

@Getter
public enum Scheme {
  HTTPS("https"), HTTP("http"),;

  private String protocol;

  Scheme(String protocol) {
    this.protocol = protocol;
  }
}
