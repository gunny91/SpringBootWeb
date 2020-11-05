package com.ghsoft.springboot.service.posts;

import com.ghsoft.springboot.domain.posts.Posts;
import com.ghsoft.springboot.domain.posts.PostsRepository;
import com.ghsoft.springboot.web.dto.PostsSaveRequestDto;
import com.ghsoft.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id , PostsUpdateRequestDto requestDto){
        Posts post = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No list of board id= "+id));

        post.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById (Long id){
        Posts entity = postsRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("No list id="+id) );
        return new PostsReponseDto(entity);
    }
}
