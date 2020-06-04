package com.work.web_work_on_class;

import com.work.web_work_on_class.service.GroupMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GroupMemberTest {
    @Autowired
    private GroupMemberService groupMemberService;

    @Test
    public void getTest(){
        System.out.println(groupMemberService.getGroupMember(1));
    }
}
