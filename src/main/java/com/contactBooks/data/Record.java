package com.contactBooks.data;

import com.contactBooks.methodTemplate.ContactMethodBlueprint;
import com.contactBooks.models.Info;
import com.contactBooks.models.InfoReadOnly;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Record implements ContactMethodBlueprint<UUID,Info> {

    static String pathname = "contacts.txt";

    private static final Map<UUID, InfoReadOnly> record = new HashMap<>();


    private static final File filename = new File(pathname);


    public Map<UUID, InfoReadOnly> getRecord() {
        return record;
        // return Collections.unmodifiableMap(record);
    }


    public InfoReadOnly getCustomerInfo(UUID uuid){
        return record.get(uuid);
    }

    public void addNewContact(Info info) {
        record.put(info.getUuid(),info);
    }

    public Map<UUID,InfoReadOnly> showAllCustomers(){
        return Collections.unmodifiableMap(record);
    }


    @Override
    public void deleteContact(UUID uuid) {
        record.remove(uuid);
        saveRecordToaFile();
    }

    @Override
    public boolean updateContact(UUID uuid, Info updatedInfo) {
        if(!record.containsKey(uuid)){
            System.out.println("Contact with UUID not found");
            return false;
        }
        record.put(uuid,updatedInfo);
        saveRecordToaFile();
        System.out.println("Update successful");
        return true;
    }

    @Override
    public void saveRecordToaFile() {
        try (FileWriter writer= new FileWriter(filename)){
            for(Map.Entry<UUID,InfoReadOnly> entry:record.entrySet()){
                UUID uuid = entry.getKey();
                InfoReadOnly info = entry.getValue();

                writer.write("UUID: " + uuid + "\n");
                writer.write("Name: " + info.getName() + "\n");
                writer.write("Phone Number: " + info.getPhoneNumber() + "\n");
                writer.write("Gender: " + info.getGender() + "\n");
                writer.write("Age: " + info.getAge() + "\n");
                writer.write("Email: " + info.getEmail() + "\n");
                writer.write("Address: " + info.getAddress() + "\n");
                writer.write("-----------------------------------------\n");
            }
            System.out.println("Record saved to " + filename.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
