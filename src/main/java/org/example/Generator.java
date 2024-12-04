package org.example;

import java.util.Random;

public class Generator {
    public static final String[] MALE_NAMES = {
            "Liam", "Noah", "Oliver", "Elijah", "James",
            "William", "Benjamin", "Lucas", "Henry", "Alexander"
    };

    public static final String[] FEMALE_NAMES = {
            "Emma", "Olivia", "Ava", "Sophia", "Isabella",
            "Mia", "Charlotte", "Amelia", "Harper", "Evelyn"
    };

    public static final String[] SURNAMES = {
            "Smith", "Johnson", "Williams", "Brown", "Jones",
            "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"
    };

    public static void generate_Person(){
        Random random = new Random();
        boolean personSex = random.nextBoolean();
        int birthYear = random.nextInt(2010);
        double salary = random.nextInt(20_000);
        String surname = SURNAMES[random.nextInt(SURNAMES.length)];
        if(personSex){
            String name = FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length)];
        } else {
            String name  = MALE_NAMES[random.nextInt(MALE_NAMES.length)];
        }




    }


}
