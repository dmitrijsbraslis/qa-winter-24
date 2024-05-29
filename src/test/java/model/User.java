package model;

import static org.apache.commons.lang3.RandomStringUtils.*;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(boolean isRandom) {
        if (isRandom) {
            firstName = randomAlphabetic(8);
            lastName = randomAlphabetic(8);
            email = randomAlphabetic(5) + "@" + randomAlphabetic(5) + ".lv";
            password = randomAlphanumeric(10);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
