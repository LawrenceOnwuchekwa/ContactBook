package com.contactBooks;

import com.contactBooks.Enum.Gender;
import com.contactBooks.data.Record;
import com.contactBooks.models.Info;
import com.contactBooks.models.InfoReadOnly;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Record phoneBook = new Record();

        Info info = new Info.Builder()
                .setName("lawrence")
                .setGender(Gender.MALE)
                .setPhoneNumber("07017051276")
                .setEmail("lawrencecheck@gmail.com")
                .setAddress("206 Road C close")
                .setAge((byte) 25)
                .build();


        Info info1  = new Info.Builder()
                .setName("Uche")
                .setGender(Gender.MALE)
                .setPhoneNumber("08032109667")
                .setEmail("chekwahillz@yahoo.com")
                .setAddress("19 Adesoye Street")
                .setAge((byte) 25)
                        .build();


        phoneBook.addNewContact(info);
        phoneBook.addNewContact(info1);

        phoneBook.saveRecordToaFile();
        Info updateInfo = new Info.Builder()
                .setName("David")
                .setAge((byte) 50)
                .setEmail("alozie@gmail.com")
                .setGender(Gender.MALE)
                .setPhoneNumber("07017051276")
                .setAddress("206 Road C close")
                .build();


        phoneBook.updateContact(info.getUuid(), updateInfo);

        phoneBook.deleteContact(info1.getUuid());
        
        for (Map.Entry<UUID, InfoReadOnly> entry
                : phoneBook.showAllCustomers().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }


}