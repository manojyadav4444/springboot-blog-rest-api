package com.springboot.blog.payload;


import jakarta.persistence.SecondaryTable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    @NotEmpty(message = "name shouldnt be empty")
    private String name;
    @NotEmpty(message = "email shouldnt be empty")
    @Email(message = "enter corret email plz")
    private String email;
    @NotEmpty
    @Size(min = 10, message = "body size should be more than 10 length")
    private String body;
}
