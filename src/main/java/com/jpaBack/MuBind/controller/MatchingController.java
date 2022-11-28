package com.jpaBack.MuBind.controller;

import com.jpaBack.MuBind.domain.user.User;
import com.jpaBack.MuBind.repository.MatchingRepository;
import com.jpaBack.MuBind.service.MatchingService;
import com.jpaBack.MuBind.service.UserService;
import com.jpaBack.MuBind.web.dto.user.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// 매칭 컨트롤러
@Controller
@RequiredArgsConstructor
public class MatchingController {

    private final MatchingService matchingService;
    private final MatchingRepository matchingRepository;
    private final UserService userService;

    //매칭홈 리턴
    @GetMapping("/matching")
    public String matchingHome(){

        return "/views/matching/matchingHome";
    }

    //매칭창 리턴
    @GetMapping("/matching/matchingView")
    public String matchingView(){
        return "views/matching/matchingView";
    }




    //매칭창 클릭시 매칭 성공창 리턴, 매칭 버튼 누를때 장르로 찾기 기능 사용
    @GetMapping("/matching/matchingSuccess")
    public String matchingSuccess() {
//        List<User> userGenre = matchingRepository.findByGenre(genre);
//        UserResponseDto dto = userService.findById(id);
//        model.addAttribute("matching",dto);
        return "/views/matching/matchingSuccess";

    }

}
