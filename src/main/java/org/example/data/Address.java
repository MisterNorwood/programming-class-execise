package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String street, flatNo, houseNo, postalCode, city, country;

    public String serialize() {
        return street + ";" + flatNo + ";" + houseNo + ";" + postalCode + ";" + city + ";" + country;
    }
}
