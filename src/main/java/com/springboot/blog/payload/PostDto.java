package com.springboot.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should be of size at least 2")
    private String title;
    @NotEmpty
    @Size(min = 10, message = "Post description should be of size at least 10")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
    private Long categoryId;
}
