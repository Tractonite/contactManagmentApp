package com.signify.contactApp.services;

import com.signify.contactApp.entity.Contact;
import com.signify.contactApp.repository.ContactRepository;
import com.signify.contactApp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ContactServicesImpl implements ContactServices{
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact getContactId(Long departmentId) {
        return contactRepository.findById(departmentId).get();
    }

    @Override
    public Contact updateContactId(Long contactId, Contact contact) {
        Contact contactDB = contactRepository.findById(contactId).get();
        if(Objects.nonNull(contact.getUserName())&& !"".equalsIgnoreCase(contact.getUserName())){
            contactDB.setUserName(contact.getUserName());
        }
        if(Objects.nonNull(contact.getPhoneNumber())&& !"".equalsIgnoreCase(contact.getPhoneNumber())){
            contactDB.setPhoneNumber(contact.getPhoneNumber());
        }
        if(Objects.nonNull(contact.getPhoneNumber())&& !"".equalsIgnoreCase(contact.getPhoneNumber())){
            contactDB.setPhoneNumber(contact.getPhoneNumber());
        }

        return contactRepository.save(contactDB);
    }

    @Override
    public String deleteContactId(Long contactId) {
        contactRepository.deleteById(contactId);
        return "Successfully Deleted";
    }


}
