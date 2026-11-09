package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    //  コンストラクタインジェクション（DIの基本）
    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Contact contact) {
        repository.save(contact);
    }

    @Override
    public List<Contact> findAll() {
        return repository.findAll();
    }
}