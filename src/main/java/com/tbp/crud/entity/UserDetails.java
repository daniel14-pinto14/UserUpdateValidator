package com.tbp.crud.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tbp.crud.config.IdCheck;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDetails {
@Id	
@GeneratedValue
@IdCheck
private int id;

private String title;
private String firstName;
private String lastName;
private String gender;

@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name = "address_id")
@JsonBackReference
private Address address;
}
