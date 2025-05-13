package com.example.chatbotai_backend.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestCaseDTO {
    private String id;
    private Object inputs;
    private Object outputs;
    private int idBaiTapLapTrinh;
    private boolean example;
}
