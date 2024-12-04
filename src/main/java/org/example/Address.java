package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String street, flatNo, houseNo, postalCode, city, country;

}
