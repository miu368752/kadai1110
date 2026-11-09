package com.example.demo.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// 画面から入力された値を受け取るFormクラス
public class ContactForm {

    // 空欄でないかチェックする（必須項目）
    @NotBlank(message = "お名前は必須です。")
    private String name;

    // 空欄チェックとメールアドレスの形式かチェックする
    @NotBlank(message = "メールアドレスは必須です。")
    @Email(message = "正しいメールアドレスを入力してください。")
    private String email;

    // 任意項目：入力された場合は数字のみかチェックする
    @Pattern(regexp = "^[0-9]*$", message = "電話番号は数字のみで入力してください。")
    private String phone;

    // 空欄でないかチェックする（必須項目）
    @NotBlank(message = "件名は必須です。")
    private String subject;

    // 空欄チェックと1000文字以内かチェックする
    @NotBlank(message = "お問い合わせ内容は必須です。")
    @Size(max = 1000, message = "お問い合わせ内容は1000文字以内で入力してください。")
    private String message;

    // お名前を取得する
    public String getName() { return name; }
    // お名前をセットする
    public void setName(String name) { this.name = name; }

    // メールアドレスを取得する
    public String getEmail() { return email; }
    // メールアドレスをセットする
    public void setEmail(String email) { this.email = email; }

    // 電話番号を取得する
    public String getPhone() { return phone; }
    // 電話番号をセットする
    public void setPhone(String phone) { this.phone = phone; }

    // 件名を取得する
    public String getSubject() { return subject; }
    // 件名をセットする
    public void setSubject(String subject) { this.subject = subject; }

    // お問い合わせ内容を取得する
    public String getMessage() { return message; }
    // お問い合わせ内容をセットする
    public void setMessage(String message) { this.message = message; }
}
