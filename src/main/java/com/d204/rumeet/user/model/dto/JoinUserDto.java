package com.d204.rumeet.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JoinUserDto {
    String email;
    String password;
    String nickname;
    String profile;

}
