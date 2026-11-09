package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

// リポジトリの宣言
@Repository
public class ContactRepository {

    // データを保持するリスト
    private final List<Contact> contactList = new ArrayList<>();

    // リストにデータを追加する
    public void save(Contact contact) {
        contactList.add(contact);
    }

    // リストの全データを取得する
    public List<Contact> findAll() {
        return contactList;
    }
}
