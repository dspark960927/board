package com.project.board.service;

import com.project.board.bean.BoardVO;
import com.project.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Override
    public BoardVO boardDetail(int b_no) {
        return boardMapper.boardDetail(b_no);
    }

    @Override
    public int boardInsert(BoardVO board) {
        return boardMapper.boardInsert(board);
    }

    @Override
    public int boardUpdate(BoardVO board) {
        return boardMapper.boardUpdate(board);
    }

    @Override
    public int boardDelete(int b_no) {
        return boardMapper.boardDelete(b_no);
    }
}
