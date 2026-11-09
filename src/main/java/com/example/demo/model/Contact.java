package com.example.demo.model;

// データを保持するモデルクラス
public class Contact {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String subject;
    private String message;

    // コンストラクタ
    public Contact() {}

    // 値をセットするコンストラクタ
    public Contact(String name, String email, String phone, String subject, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.message = message;
    }

    // --- Getter / Setter ---
    public Long getId() {
        return id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
