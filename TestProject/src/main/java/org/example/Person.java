package org.example;

class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    // Optional: Useful for printing
    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + id + ")";
    }
}
