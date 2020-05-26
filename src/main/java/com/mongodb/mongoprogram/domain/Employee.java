package com.mongodb.mongoprogram.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Employee {

    @Id
    private String id;
    private String name;
    private String city;
    private List<Address> addressList;
}
