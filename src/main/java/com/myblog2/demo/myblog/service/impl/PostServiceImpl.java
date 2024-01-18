package com.myblog2.demo.myblog.service.impl;

import com.myblog2.demo.myblog.DTO.PostDto;
import com.myblog2.demo.myblog.entity.Post;
import com.myblog2.demo.myblog.exception.ResourseNotFoundException;
import com.myblog2.demo.myblog.repository.PostRepository;
import com.myblog2.demo.myblog.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private  PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto CreatePost(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTittle(postDto.getTittle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post savePost = postRepo.save(post);

        PostDto dto = new PostDto();
        dto.setId(savePost.getId());
        dto.setContent(savePost.getContent());
        dto.setDescription(savePost.getDescription());
        dto.setTittle(savePost.getContent());

        return dto;
    }

    @Override
    public PostDto GetPostById(long id) {

        Post post = postRepo.findById(id).orElseThrow(() -> new ResourseNotFoundException("Resource Not Found With Id :" + id));

//        PostDto dto = new PostDto();
//        dto.setId(post.getId());
//        dto.setTittle(post.getTittle());
//        dto.setContent(post.getContent());
//        dto.setDescription(post.getDescription());
        PostDto dto = this.PostToPostDto(post);
        return dto;
    }

    @Override
    public List<PostDto> GetAllPost(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Post> postPage = postRepo.findAll(pageable);
        List<Post> allPost = postPage.getContent();
        List<PostDto> dto = allPost.stream().map(this::PostToPostDto).collect(Collectors.toList());
        return dto;
    }

    @Override
    public void deletePostById(long id) {
        postRepo.deleteById(id);
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
       if(postDto == null){
           throw new ResourseNotFoundException("Data should not be null...");
       }

        Post post = postRepo.findById(id).orElseThrow(() -> new ResourseNotFoundException("Not found with id "+id));


        post.setTittle(postDto.getTittle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post save = postRepo.save(post);
        PostDto postDto1 = this.PostToPostDto(save);

        return postDto1;

    }


    public Post postDtoToPost(PostDto postDto){
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTittle(postDto.getTittle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        return post;
    }

    public PostDto PostToPostDto(Post post){
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTittle(post.getTittle());
        postDto.setContent(post.getContent());
        postDto.setDescription(post.getDescription());
        return postDto;
    }
}
