package com.example.board.dto;

import lombok.Getter;

@Getter
public class BoardWithAgeResponseDto {

    private final String title;

    private final String Contents;

    private final Integer age;

    public BoardWithAgeResponseDto(String title, String contents, Integer age) {
        this.title = title;
        Contents = contents;
        this.age = age;
    }
}
