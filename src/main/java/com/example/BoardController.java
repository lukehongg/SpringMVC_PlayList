package com.example;

import com.dao.BoardDAO;
import com.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    @Autowired
    BoardDAO boardDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("list", boardDAO.getBoardList());
        return "board/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String boardlist(Model model){
        model.addAttribute("list", boardDAO.getBoardList());
        return "board/list";
    }
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String addPost(BoardVO vo){
        return "board/addpostform";
    }
    @RequestMapping(value="/addok", method = RequestMethod.POST)
    public String addPostOK(BoardVO vo){
        int i = boardDAO.insertBoard(vo);
        if(i==0) System.out.println("데이터 추가 실패");
        else System.out.println("데이터 추가 성공!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") Integer seq, Model model){
        BoardVO boardVO = boardDAO.getBoard(seq);
        model.addAttribute("boardVO", boardVO);
        return "board/editform";
    }

    @RequestMapping(value="/editok", method = RequestMethod.POST)
    public String editPostOK(BoardVO vo){
        int i = boardDAO.updateBoard(vo);
        if(i==0) System.out.println("데이터 수정 실패");
        else System.out.println("데이터 수정 성공!!");
        return "redirect:list";
    }
    @RequestMapping(value="/deleteok/{id}", method = RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id){
        int i = boardDAO.deleteBoard(id);
        if(i==0) System.out.println("데이터 삭제 실패");
        else System.out.println("데이터 삭제 성공!!");
        return "redirect:../list";
    }




}
