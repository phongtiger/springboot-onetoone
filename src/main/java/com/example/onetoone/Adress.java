package com.example.onetoone;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Adress {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String provice;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
