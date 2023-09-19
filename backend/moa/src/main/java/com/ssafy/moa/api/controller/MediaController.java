package com.ssafy.moa.api.controller;

import com.ssafy.moa.api.entity.elastic.MediaInfoDocument;
import com.ssafy.moa.api.service.MediaService;
import com.ssafy.moa.common.utils.ApiUtils;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ssafy.moa.common.utils.ApiUtils.success;

@RestController
@RequestMapping("/media")
@RequiredArgsConstructor
@Slf4j
public class MediaController {

    private final MediaService mediaService;

    @Operation(summary = "미디어 제목 or 아티스트 검색", description = "드라마 속 장소나 아티스트가 방문한 장소의 정보를 반환합니다.(장소에 대한 설명에서도 검색)", tags = { "Media Controller" })
    @GetMapping()
    public ApiUtils.ApiResult<List<MediaInfoDocument>> searchMedia(@RequestParam(name = "mediaName") String mediaName){
        List<MediaInfoDocument> mediaList = mediaService.searchMedia(mediaName);
        return success(mediaList);
    }

    // 미디어 재목 or 아티스트 자동완성


    // 미디어 내용 자동완성
}
