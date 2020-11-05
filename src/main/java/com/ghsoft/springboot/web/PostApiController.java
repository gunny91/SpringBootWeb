package com.ghsoft.springboot.web;


import com.ghsoft.springboot.service.posts.PostService;
import com.ghsoft.springboot.web.dto.PostsSaveRequestDto;
import com.ghsoft.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostService postService;

    @PostMapping("api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){ return postService.save(requestDto);}

    @PostMapping("api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postService.update(id, requestDto);
    }

    @GetMapping("/api/v1/post/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postService.findById(id);
    }
}
