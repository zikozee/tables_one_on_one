package com.spiritbeing.tables_one_on_one.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "person")
@SecondaryTable(name = "role", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person_id"))
@Setter @Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "fullName")
    String fullName;

    @Column(name = "description")
    String description;

    @Column(name = "price")
    BigDecimal price;

    @Column(name = "user", table = "role")
    String user;

    @Column(name = "manager", table = "role")
    String manager;

    @Column(name = "admin", table = "role")
    String admin;
}
