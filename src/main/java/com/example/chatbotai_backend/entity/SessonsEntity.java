package com.example.chatbotai_backend.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "sessons")
public class SessonsEntity {
    @Id
    private String id;

    private Date startTime;
    private Date endTime;
    private Messages messages;
}
