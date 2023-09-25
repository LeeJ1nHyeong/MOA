package com.ssafy.moa.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class KeywordDto {
    private Long keywordId;
    private String keywordName;

    @Builder
    public KeywordDto(Long keywordId, String keywordName) {
        this.keywordId = keywordId;
        this.keywordName = keywordName;
    }
}
