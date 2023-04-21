package com.project.board.mapper;

import com.project.board.bean.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVO> getBoardList(); //게시물 리스트
    BoardVO boardDetail(int b_no); //게시글 세부내용
    int boardInsert(BoardVO board); //게시글 생성
    int boardUpdate(BoardVO board); //게시글 수정
    int boardDelete(int b_no); //게시물 삭제


}
