package com.jpaBack.MuBind.controller;

import com.jpaBack.MuBind.config.auth.LoginUser;
import com.jpaBack.MuBind.config.auth.dto.SessionUser;
import com.jpaBack.MuBind.service.PostsService;
import com.jpaBack.MuBind.web.dto.post.PostsResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

    // 게시판 컨트롤러
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    //게시판 메인 주소 리턴
    @GetMapping("/")
    public String home() {
        return "/views/matching/matchingHome";
    }
        @GetMapping("/posts")
        public String index(Model model, @LoginUser SessionUser user) {
            model.addAttribute("posts", postsService.findAllDesc());
            if (user != null) {
                model.addAttribute("userName", user.getName());
            }
            return "index";

        }


    //글 저장시 주소 리턴

    @GetMapping("/posts/save")
    public String postsSave() {

        return "posts-save";
    }


      @GetMapping("/login")
      public String loginUser(){
        return "/views/login/loginHome";
      }


//   //글 작성 시 주소 리턴
//    @GetMapping("/post/write")
//    public String postWrite(){
//
//        return"posts-";
//    }


    //글 수정시 주소 리턴
    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }



}