package com.EltonFerreira.bookstoremananger.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor



public class AuthorDTO {
    private  long id ;

    @Size(max = 200)
    private String  name;

    @NotNull
    @Size(max = 100)
    private Integer age;
}
