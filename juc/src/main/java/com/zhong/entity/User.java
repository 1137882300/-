package com.zhong.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private int age;
    private String name;
    private boolean flag;

    private List<User> userList;

}
