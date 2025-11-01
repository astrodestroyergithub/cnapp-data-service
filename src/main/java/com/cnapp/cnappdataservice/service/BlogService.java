package com.cnapp.cnappdataservice.service;

import org.springframework.stereotype.Service;
import com.cnapp.cnappdataservice.entity.Blog;
import com.cnapp.cnappdataservice.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blog postBlog(Blog blog) {
        return blogRepository.save(blog);
    }
}
