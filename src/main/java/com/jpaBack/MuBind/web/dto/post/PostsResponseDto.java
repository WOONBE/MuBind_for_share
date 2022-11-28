package com.jpaBack.MuBind.web.dto.post;

import com.jpaBack.MuBind.domain.posts.Posts;
import lombok.Getter;

//게시판 반응 dto
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}

