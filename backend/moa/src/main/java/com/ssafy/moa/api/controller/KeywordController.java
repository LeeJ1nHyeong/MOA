package com.ssafy.moa.api.controller;

import com.ssafy.moa.api.dto.KeywordReqDto;
import com.ssafy.moa.api.jwt.JwtTokenProvider;
import com.ssafy.moa.api.service.KeywordService;
import com.ssafy.moa.common.utils.ApiUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ssafy.moa.common.utils.ApiUtils.success;

@RestController
@RequestMapping("/keyword")
@RequiredArgsConstructor
@Tag(name = "Keyword", description = "키워드 API, 등록 API에 access token 필요")
@Slf4j
public class KeywordController {
    private final KeywordService keywordService;
    private final JwtTokenProvider jwtTokenProvider;

    @Operation(summary = "키워드 등록", description = "밸런스게임을 등록할 수 있습니다.", tags = { "Keyword Controller" })
    @PostMapping
    public ApiUtils.ApiResult<Long> createKeyword(/* @RequestHeader("Authorization") String header,*/ @RequestBody List<KeywordReqDto> keywordList){
//        String token = header.substring(7);
//        Long memberId = jwtTokenProvider.extractMemberId(token);
        Long memberId = 14L;
        return success(keywordService.createKeyword(memberId, keywordList));
    }

}
