package com.example.chatbotai_backend.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection  = "Testcase")
public class TestCaseEntity {
    @Id
    private String id;
    private Object inputs;
    private Object outputs;
    private boolean example = true;
    private Integer idBaiTapLapTrinh;
}
