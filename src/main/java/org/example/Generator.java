package org.example;

import org.example.data.Address;
import org.example.data.Company;
import org.example.data.Person;

import java.util.HashMap;
import java.util.Random;

public class Generator {

    private static Random random = new Random();
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

    public static HashMap<String, Integer> COMPANIES = new HashMap<>();
    public static HashMap<String, String[]> COUNTRIES_CITIES = new HashMap<>();

    static {
        COMPANIES.put("TechCorp Inc.", 1988);
        COMPANIES.put("Greenleaf Solutions", 2003);
        COMPANIES.put("Skyline Enterprises", 2012);
        COMPANIES.put("Pioneer Systems", 2000);
        COMPANIES.put("Starlight Innovations", 1997);

        COUNTRIES_CITIES.put("Germany", new String[]{"Berlin", "Munich", "Hamburg"});
        COUNTRIES_CITIES.put("France", new String[]{"Paris", "Marseille", "Lyon"});
        COUNTRIES_CITIES.put("United Kingdom", new String[]{"London", "Manchester", "Birmingham"});
        COUNTRIES_CITIES.put("Italy", new String[]{"Rome", "Milan", "Naples"});
        COUNTRIES_CITIES.put("Spain", new String[]{"Madrid", "Barcelona", "Valencia"});
        COUNTRIES_CITIES.put("Poland", new String[]{"Warsaw", "Krakow", "Gdansk"});
        COUNTRIES_CITIES.put("Netherlands", new String[]{"Amsterdam", "Rotterdam", "The Hague"});
        COUNTRIES_CITIES.put("Sweden", new String[]{"Stockholm", "Gothenburg", "Malmö"});
        COUNTRIES_CITIES.put("Switzerland", new String[]{"Zurich", "Geneva", "Bern"});
        COUNTRIES_CITIES.put("Austria", new String[]{"Vienna", "Salzburg", "Graz"});
    }

    String[] STREETS = {
            "Elm Street",
            "Oak Avenue",
            "Maple Boulevard",
            "Pine Lane",
            "Cedar Drive"
    };

    String[] JOBS = {
            "Software Engineer",
            "Product Manager",
            "Data Scientist",
            "UX/UI Designer",
            "DevOps Engineer",
            "Quality Assurance Engineer",
            "Technical Writer",
            "Cloud Architect",
            "Cybersecurity Specialist",
            "Full Stack Developer",
            "IT Support Specialist",
            "Database Administrator",
            "Scrum Master",
            "Marketing Specialist",
            "Sales Engineer"
    };


    public Person generatePerson() {
        boolean personSex = random.nextBoolean();
        String name;
        String surname = pullRandom(SURNAMES);
        if (personSex) {
            name = pullRandom(FEMALE_NAMES);
        } else {
            name = pullRandom(MALE_NAMES);
        }
        return new Person(name, surname, personSex, 1960 + random.nextInt(41), pullRandom(JOBS), generateCompany(), 10_000 + random.nextInt(10_000), generateAddress());
    }

    private Address generateAddress() {
        int randomNumber = 10000 + random.nextInt(90000);
        String postal = String.valueOf(randomNumber);
        String country = pullRandom(COUNTRIES_CITIES.keySet().toArray(new String[0]));
        String city = pullRandom(COUNTRIES_CITIES.get(country));
        return new Address(pullRandom(STREETS), String.valueOf(random.nextInt(40)), String.valueOf(random.nextInt(10)), postal, city, country);
    }

    private Company generateCompany() {
        String name = pullRandom(COMPANIES.keySet().toArray(new String[0]));
        int year = COMPANIES.get(name);
        return new Company(name, year);
    }

    private String pullRandom(String[] constant) {
        return constant[random.nextInt(constant.length)];
    }


}
