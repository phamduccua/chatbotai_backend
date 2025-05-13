package com.example.chatbotai_backend.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeAndNameAndLevelBaiLapTrinh {
    private Integer id;
    private String code;
    private String name;
    private Integer level;
    public CodeAndNameAndLevelBaiLapTrinh(Integer id,String code, String name, Integer level) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.level = level;
    }
}
