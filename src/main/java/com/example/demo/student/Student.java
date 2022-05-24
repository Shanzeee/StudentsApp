package com.example.demo.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//@Data we dont want final :(
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
