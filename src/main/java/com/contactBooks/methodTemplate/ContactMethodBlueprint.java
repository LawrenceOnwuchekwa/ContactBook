package com.contactBooks.methodTemplate;

import com.contactBooks.models.Info;
import com.contactBooks.models.InfoReadOnly;

import java.util.UUID;

public interface ContactMethodBlueprint<T,Y> {

    void deleteContact(T t);

    boolean updateContact(T t,Y y);

    void saveRecordToaFile();

}
