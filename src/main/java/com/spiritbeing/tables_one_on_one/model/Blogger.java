package com.spiritbeing.tables_one_on_one.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "blogger")
@SecondaryTable(name = "blogRole", pkJoinColumns = @PrimaryKeyJoinColumn(name = "blogger_id"))
@Getter @Setter
class Blogger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "price")
    BigDecimal price;

    @Embedded
    BlogRole blogRole;


}

@Embeddable
@Getter @Setter
class BlogRole {

    @Column(name = "user", table = "blogRole")
    boolean user;

    @Column(name = "manager", table = "blogRole")
    boolean manager;

    @Column(name = "admin", table = "blogRole")
    boolean admin;

    // standard getters and setters

}
