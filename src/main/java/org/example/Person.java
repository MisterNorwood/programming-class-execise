package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name, surname;
    private boolean sex; // Female if true
    private int bornYear;
    private String job;
    private Company comapny;
    private double salary;
    private Address address;





}
