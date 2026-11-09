package com.example.demo.service;

import com.example.demo.model.Contact;
import java.util.List;

public interface ContactService {
    void save(Contact contact);
    List<Contact> findAll();
}}