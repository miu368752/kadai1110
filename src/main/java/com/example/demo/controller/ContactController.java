package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ContactForm;
import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;

// コントローラーの宣言
@Controller
// URLを/contactに設定
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    // コンストラクタインジェクション
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // 入力画面を表示する
    @GetMapping
    public String showForm(Model model) {
        // 空のフォームを画面に渡す
        model.addAttribute("contactForm", new ContactForm());
        return "contactForm";
    }

    // 送信ボタンが押されたときの処理
    @PostMapping("/submit")
    public String submit(@Validated @ModelAttribute ContactForm contactForm, BindingResult result, Model model) {
        // 入力エラーがある場合は入力画面に戻る
        if (result.hasErrors()) {
            return "contactForm";
        }

        // Formの値をContactに移す
        Contact contact = new Contact(
                contactForm.getName(),
                contactForm.getEmail(),
                contactForm.getPhone(),
                contactForm.getSubject(),
                contactForm.getMessage()
        );

        // データを保存する
        contactService.save(contact);
        // 完了画面に表示するデータを渡す
        model.addAttribute("contact", contact);
        return "contactResult";
    }
}
