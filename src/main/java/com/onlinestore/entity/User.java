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
public class User extends AbstractEntity {
    private String username;
    private String password;
    private String email;
    private String phone;
}
