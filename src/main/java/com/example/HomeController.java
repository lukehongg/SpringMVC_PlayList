package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

//@Controller
//public class HomeController {

//    @RequestMapping("/")
//    public String home(){
//        return "index";
//    }
//
//    @RequestMapping("board/")
//    public String list(Model model){
//        List<String> list = new ArrayList<String>();
//        list.add("실프");
//        list.add("컴구");
//        list.add("컴비");
//        list.add("이산");
//        model.addAttribute("classlist", list);
//        String msg = "2-2 교과목 리스트";
//        model.addAttribute("title", msg);
//        return "board/list";
//    }
//
//}