package com.example.demo.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 画面入力用フォームクラス
 * バリデーション設定付き
 */
public class ContactForm {

    @NotBlank(message = "お名前は必須です。")
    private String name;

    @NotBlank(message = "メールアドレスは必須です。")
    @Email(message = "正しいメールアドレスを入力してください。")
    private String email;

    // 任意項目、数字のみ許可（空欄可）
    @Pattern(regexp = "^[0-9]*$", message = "電話番号は数字のみで入力してください。")
    private String phone;

    @NotBlank(message = "件名は必須です。")
    private String subject;

    @NotBlank(message = "お問い合わせ内容は必須です。")
    @Size(max = 1000, message = "お問い合わせ内容は1000文字以内で入力してください。")
    private String message;

    // --- Getter / Setter ---
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
