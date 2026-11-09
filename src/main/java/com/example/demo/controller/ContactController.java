package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    // コンストラクタインジェクション
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contactForm";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Contact contact, Model model) {
        contactService.save(contact);
        model.addAttribute("message", "送信が完了しました。");
        return "contactResult";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "contactList";
    }
}
