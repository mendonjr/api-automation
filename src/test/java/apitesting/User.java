package apitesting;

import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private ArrayList<Integer> mobilenumbers;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public ArrayList<Integer> getMobilenumbers() {
        return mobilenumbers;
    }

    public void setMobilenumbers(int... mobilenumbers) {
        for(int i=0;i<mobilenumbers.length;i++){
            this.mobilenumbers.add(mobilenumbers[i]);
        }
    }

    public User(String firstName, String lastName, String email,String doorNo, String city, String state, String country){
        this.firstName = firstName;
        this.lastName=lastName;
        this.email=email;
        this.mobilenumbers = new ArrayList<Integer>();
        this.address = new Address(doorNo,city,state,country);
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
}
