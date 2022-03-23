package com.onlinestore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Buy extends AbstractEntity {
    private String buyDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyBook_id")
    private BuyBook buyBook;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buySteep_id")
    private BuyStep buyStep;
}
