package com.project.board.controller;

import com.project.board.bean.BoardVO;
import com.project.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/list")
    private String boardList(Model model, HttpServletRequest request) {
        List<BoardVO> testList = new ArrayList<>();
        testList = boardService.getBoardList();
        model.addAttribute("testList", testList);

        return "board/list";
    }

    @RequestMapping("/detail/{b_no}")
    private String boardDetail(@PathVariable("b_no") int b_no, Model model){
        model.addAttribute("detail",boardService.boardDetail(b_no));
        return "board/detail";
    }

    @RequestMapping("/insert")
    private String boardInsertForm(@ModelAttribute BoardVO board){
        return "board/insert";
    }

    @RequestMapping("/insertProc")
    private String boardInsertProc(@ModelAttribute BoardVO board, HttpServletRequest request){
        boardService.boardInsert(board);
        return "forward:/board/list";
    }

    @RequestMapping("/update/{b_no}")
    private String boardUpdateForm(@PathVariable("b_no") int b_no, Model model){
        model.addAttribute("detail", boardService.boardDetail(b_no));
        return "board/update";
    }

    @RequestMapping("/updateProc")
    private String boardUpdateProc(@ModelAttribute BoardVO board) {
        boardService.boardUpdate(board);
        int bno = board.getB_no();
        String b_no = Integer.toString(bno);
        return "redirect:/board/detail/"+b_no;
    }

    @RequestMapping("/delete/{b_no}")
    private String boardDelect(@PathVariable("b_no") int b_no) {
        boardService.boardDelete(b_no);
        return "redirect:/board/list";
    }

}
