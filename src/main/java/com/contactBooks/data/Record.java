package com.contactBooks.data;

import com.contactBooks.methodTemplate.ContactMethodBlueprint;
import com.contactBooks.models.Info;
import com.contactBooks.models.InfoReadOnly;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Record implements ContactMethodBlueprint {

    private static Map<UUID, InfoReadOnly> record = new HashMap<>();

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
    }

    @Override
    public boolean updateContact(UUID uuid) {
        return false;
    }
}
