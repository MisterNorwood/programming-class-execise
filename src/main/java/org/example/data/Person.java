package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data
public class Person {
    private String name, surname;
    private boolean sex; // Female if true
    private int bornYear;
    private String job;
    private Company comapny;
    private double salary;
    private Address address;

    public String getSex() {
        if (sex) {
            return "Female";
        } else {
            return "Male";
        }
    }

    public String serialize() {
        return name + ";" + surname + ";" + getSex() + ";" + bornYear + ";" + job + ";" + salary + ";" + address.serialize() + ";" + address.serialize();

    }


}
