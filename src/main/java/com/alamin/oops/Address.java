package com.alamin.oops;

// TODO: 4/21/2023 This class is mutable
public class Address {
    private  String city;
    private  String state;

    public Address() {
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // TODO: 4/21/2023 Copy Constructor
    public  Address(Address address){
        this(address.getCity(), address.getState());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
