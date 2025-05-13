package com.example.chatbotai_backend.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Messages {
    private String content;
    private Date timetamp;
    private String sender;
}
