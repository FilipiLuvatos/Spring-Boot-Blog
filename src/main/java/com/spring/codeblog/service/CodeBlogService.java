package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface CodeBlogService  {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
