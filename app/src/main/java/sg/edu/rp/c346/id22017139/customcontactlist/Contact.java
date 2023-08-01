package sg.edu.rp.c346.id22017139.customcontactlist;

import androidx.annotation.NonNull;

public class Contact {
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    // Constructor
    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for countryCode
    public int getCountryCode() {
        return countryCode;
    }

    // Getter for phoneNum
    public int getPhoneNum() {
        return phoneNum;
    }

    // Getter for gender
    public char getGender() {
        return gender;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for countryCode
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    // Setter for phoneNum
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    // Setter for gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString() method
    @NonNull
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", phoneNum=" + phoneNum +
                ", gender=" + gender +
                '}';
    }

}
