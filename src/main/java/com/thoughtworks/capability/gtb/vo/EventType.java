package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");
  @JsonValue
  private String code;

  public String getCode() {
    return code;
  }

  EventType(String code) {
    this.code = code;
  }
}
