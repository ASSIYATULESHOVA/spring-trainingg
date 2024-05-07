package com.cydeo.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor   //BREAK TILL 12:10
@Data
public class Genre extends BaseEntity {

    private String name;
}
