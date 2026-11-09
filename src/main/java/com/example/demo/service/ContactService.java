package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Contact;

// Service層のインターフェース
public interface ContactService {

    // お問い合わせデータを保存するメソッド
    void save(Contact contact);

    // お問い合わせデータを全件取得するメソッド
    List<Contact> findAll();
}
