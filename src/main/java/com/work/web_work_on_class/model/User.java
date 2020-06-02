package com.work.web_work_on_class.model;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer userId;

    private String userNickName;

    private String userPassword;

    public User(String userNickName, String userPassword, String userEmail, String userTel) {
        this.userNickName = userNickName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userTel = userTel;
    }

    private String userEmail;

    private String userTel;

    private static final long serialVersionUID = 1L;

}