package com.jpaBack.MuBind.web.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//유저 프로필 창 dto
@Getter
@Setter
@NoArgsConstructor
public class UserPageDto {
    private Long totalCount;
    private List<UserResponseDto> userList;

    public UserPageDto(Long totalCount, List<UserResponseDto> userList) {
        this.totalCount = totalCount;
        this.userList = userList;
    }
}