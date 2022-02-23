package com.tbp.crud.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String state;
    private Integer postCode;
    @OneToOne(mappedBy = "address")
    @JsonManagedReference
    private UserDetails user;
}
