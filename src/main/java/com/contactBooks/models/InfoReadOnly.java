package com.contactBooks.models;

import com.contactBooks.Enum.Gender;

import java.util.UUID;

public interface InfoReadOnly {
    int getId();

    UUID getUuid();

    String getName();

    String getPhoneNumber();

    Gender getGender();

    byte getAge();

    String getEmail();

    String getAddress();

    @Override
    String toString();
}
