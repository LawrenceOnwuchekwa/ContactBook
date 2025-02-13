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



        Info info = new Info();
        info.setName("lawrence");
        info.setGender(Gender.MALE);
        info.setPhoneNumber("07017051276");
        info.setEmail("lawrencecheck@gmail.com");
        info.setAddress("206 Road C close");
        info.setAge((byte) 25);
        info.setUuid(info.getUuid());


        Info info1 = new Info();
        info1.setName("Uche");
        info1.setGender(Gender.MALE);
        info1.setPhoneNumber("08032109667");
        info1.setEmail("chekwahillz@yahoo.com");
        info1.setAddress("19 Adesoye Street");
        info1.setAge((byte) 25);
        info1.setUuid(info1.getUuid());


        phoneBook.addNewContact(info);
        phoneBook.addNewContact(info1);

        for (Map.Entry<UUID, InfoReadOnly> entry
                : phoneBook.showAllCustomers().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }


}