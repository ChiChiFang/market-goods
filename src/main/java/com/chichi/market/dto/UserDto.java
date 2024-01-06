package com.chichi.market.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private Integer user_id;

    private String nick_name;

    private String real_name;

    private String phone;

    private String password;

    private Date last_login_time;

    private String last_Login_ip;

    private static final long serialVersionUID = 1L;
}
