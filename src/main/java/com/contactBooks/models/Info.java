package com.contactBooks.models;

import com.contactBooks.Enum.Gender;
import com.contactBooks.utility.UUIDGenerator;

import java.io.Serializable;
import java.util.UUID;

public class Info implements InfoReadOnly {

    //Builder Pattern
    private final UUID uuid;
    private final String name;

    private final String phoneNumber;

    private final Gender gender;

    private final byte age;

    private final String email;

    private final String address;


    private Info(Builder builder) {
        this.uuid = builder.uuid != null ? builder.uuid : UUID.randomUUID(); ;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.gender = builder.gender;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }




    @Override
    public UUID getUuid() {
        return uuid;
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public Gender getGender() {
        return gender;
    }


    @Override
    public byte getAge() {
        return age;
    }

    @Override
    public String getEmail() {
        return email;
    }


    @Override
    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Info{" +
                ", uuid=" + uuid +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    //Using the builder pattern

    public static class Builder{
        private UUID uuid;
        private String name;

        private String phoneNumber;

        private Gender gender;

        private byte age;

        private String email;

        private String address;

        public Builder() {
            this.uuid = UUID.randomUUID();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAge(byte age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Info build(){
            return new Info(this);
        }


    }



}
