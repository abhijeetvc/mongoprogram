package com.mongodb.mongoprogram.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class UserReg {
    @Id
    private String id;
    private String userName;
    private String city;
    private Integer age;
    private String address;

}
