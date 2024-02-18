package com.signify.contactApp.controller;

import com.signify.contactApp.entity.Contact;
import com.signify.contactApp.services.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    @Autowired
    private ContactServices contactServices;
    @PostMapping("/api/v1/users")
    public Contact saveContact(@RequestBody Contact contact){
        return contactServices.saveContact(contact);
    }
    @GetMapping ("/api/v1/users/{id}")
    public Contact getContactId(@PathVariable("id") Long contactId){
        return contactServices.getContactId(contactId);
    }

    @PutMapping("/api/v1/users/{id}")
    public Contact updateContactId(@PathVariable("id") Long contactId, @RequestBody Contact contact){
        return contactServices.updateContactId(contactId, contact);
    }

    @DeleteMapping("/api/v1/users/{id}")
    public String deleteContactId(@PathVariable("id") Long contactId) {
        return contactServices.deleteContactId(contactId);

    }
}
