package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

// サービス層のクラスであることを示す（DIの対象にする）
@Service
public class ContactServiceImpl implements ContactService {

    // Repositoryを使うための変数
    private final ContactRepository repository;

    // コンストラクタインジェクションでRepositoryを受け取る
    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    // データを保存する処理
    @Override
    public void save(Contact contact) {
        // Repositoryのsaveメソッドを呼び出す
        repository.save(contact);
    }

    // データを全件取得する処理
    @Override
    public List<Contact> findAll() {
        // RepositoryのfindAllメソッドを呼び出してリストを返す
        return repository.findAll();
    }
}
