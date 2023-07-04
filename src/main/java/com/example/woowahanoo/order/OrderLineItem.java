package com.example.woowahanoo.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="ORDER_LINE_ITEMS")
@Getter
@NoArgsConstructor
public class OrderLineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDER_LINE_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="MENU_ID")
    private Menu menu;

    public void validate() {
        menu.validateOrder(name, convertToOptionGroups());
    }

}
