package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.DataSerializer;
import com.thoughtworks.capability.gtb.serializer.PersonSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {
  private String id;
  private String name;
  private EventType type;
  @JsonFormat(shape = JsonFormat.Shape.NUMBER)
  //@JsonSerialize(using=DataSerializer.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
