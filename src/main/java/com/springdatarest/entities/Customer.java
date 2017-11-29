package com.springdatarest.entities;


import javax.persistence.*;

@Entity
@Table(name = "TAB_CUSTOMER", catalog = "test", schema = "test", indexes = {
        @Index(name = "forename_index", unique = true, columnList = "forename")
})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String forename;
    private String lastname;

    public Customer() {
    }

    public Customer(String forename, String lastname) {
        this.forename = forename;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, forename='%s', lastname='%s']",
                id, forename, lastname);
    }


}
