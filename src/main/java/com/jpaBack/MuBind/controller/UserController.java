package com.jpaBack.MuBind.controller;

import com.jpaBack.MuBind.service.UserService;
import com.jpaBack.MuBind.web.dto.user.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//유저 프로필 컨트롤러
@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;

    //유저 프로필 조회
    @GetMapping("/user/{id}")
    public String findById(@PathVariable Long id, Model model) {

        UserResponseDto dto = userService.findById(id);
        model.addAttribute("user", dto);
        return "views/profile/profileHome";

    }

    //유저 프로필 업데이트(장르 넣게 해놓음)
    @PutMapping("/user/{id}")
    public Long update(@PathVariable Long id, @RequestBody UserResponseDto responseDto) {
        return userService.update(id, responseDto);
    }
}
