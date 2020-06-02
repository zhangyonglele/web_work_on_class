package com.work.web_work_on_class.service;

import com.work.web_work_on_class.model.User;

public interface UserService {
    User getUserByEmail(String email);

    User getUserByTel(String tel);

    boolean addNewUser(User record);
}
