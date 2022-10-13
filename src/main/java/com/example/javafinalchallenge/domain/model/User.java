package com.example.javafinalchallenge.domain.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class User {

  private int id;

  @NotBlank(message = "名前が指定されていません。")
  private String name;


  @NotBlank(message = "メールアドレスが指定されていません。")
  @Email
  private String email;
}
