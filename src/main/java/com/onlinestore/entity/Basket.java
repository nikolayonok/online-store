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

public class Basket extends AbstractEntity {
    private long used_id;
    private int count;
    private int cost;
}
