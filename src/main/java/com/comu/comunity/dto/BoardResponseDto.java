package com.comu.comunity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class BoardResponseDto {
    private long id;
    private long memberId;
    private String name;
    private String contents;
    private List<CommentResponseDto> comment;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
