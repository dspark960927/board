package com.project.board.service;

import com.project.board.bean.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getBoardList();
    BoardVO boardDetail(int b_no);
    int boardInsert(BoardVO board);
    int boardUpdate(BoardVO board);
    int boardDelete(int b_no);
}
