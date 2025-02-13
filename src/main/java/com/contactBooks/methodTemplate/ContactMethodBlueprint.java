package com.contactBooks.methodTemplate;

import com.contactBooks.models.Info;
import com.contactBooks.models.InfoReadOnly;

import java.util.UUID;

public interface ContactMethodBlueprint<T,X> {

    void deleteContact(T t);

    boolean updateContact(T t);

    void saveRecordToaFile(X x, String filename);
}
