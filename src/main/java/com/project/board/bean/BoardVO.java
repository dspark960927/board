package com.project.board.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
    private int b_no; //게시물 번호
    private String title; //게시물 제목
    private String content; //게시물 내용
    private String writer; //작성자
    private Date reg_date; //작성일
}
