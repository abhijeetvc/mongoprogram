package com.mongodb.mongoprogram.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Setter
public class Post {

    @Id
    private String id;
    private String postName;

    @DBRef
    private UserReg userReg;
}
