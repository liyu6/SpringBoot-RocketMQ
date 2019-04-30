package com.springboot.rocketmq.springbootrocketmq.content;


import lombok.*;
import lombok.experimental.Accessors;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@Getter
@Setter
public class UserContent {

    private String username;
    private String pwd;
}
