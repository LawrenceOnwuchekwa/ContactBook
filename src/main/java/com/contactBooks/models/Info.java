package com.contactBooks.models;

import com.contactBooks.Enum.Gender;
import com.contactBooks.utility.UUIDGenerator;

import java.io.Serializable;
import java.util.UUID;

public class Info implements InfoReadOnly, Serializable {

    private int id;
    private UUID uuid;
    private String name;

    private String phoneNumber;

    private Gender gender;

    private byte age;

    private String email;

    private String address;

    public Info() {
        this.uuid = UUID.randomUUID();
    }

    public Info(int id, UUID uuid, String name, String phoneNumber, Gender gender, byte age, String email, String address) {
        this.id = id;
        this.uuid = uuid != null ? uuid : UUID.randomUUID(); ;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
