package com.contactBooks.methodTemplate;

import com.contactBooks.models.Info;
import com.contactBooks.models.InfoReadOnly;

import java.util.UUID;

public interface ContactMethodBlueprint {

    void deleteContact(UUID uuid);

    boolean updateContact(UUID uuid);


}
