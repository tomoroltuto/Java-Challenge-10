package com.example.javafinalchallenge.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
public class User {

    private int id;

    @NotEmpty
    @Size(min = 1, max = 10, message = "名前は1～10文字に設定してください")
    private String name;

    @NotBlank(message = "担当のコースを入力してください")
    private String teacher;

}
