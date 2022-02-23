package com.onlinestore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product extends AbstractEntity {
    private String name;
    private String description;
    private int price;
}
