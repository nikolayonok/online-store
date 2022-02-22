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

public class Roles extends AbstractEntity {
    private long user;
    private long admin;
    private long anonymous;

}
