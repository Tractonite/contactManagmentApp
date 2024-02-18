package com.signify.contactApp.services;

import com.signify.contactApp.entity.Contact;

public interface ContactServices {
     Contact saveContact(Contact contact);

    Contact getContactId(Long contactId);

    Contact updateContactId(Long contactId, Contact contact);


    String deleteContactId(Long contactId);
}
