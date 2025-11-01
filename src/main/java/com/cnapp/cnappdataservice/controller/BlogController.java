package com.cnapp.cnappdataservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.cnapp.cnappdataservice.service.BlogService;
import com.cnapp.cnappdataservice.entity.Blog;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/data")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @PostMapping("add-blog")
    public Blog postBlog(@RequestBody Blog blog) {
        return blogService.postBlog(blog);
    }
    
}
