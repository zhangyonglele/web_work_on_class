package com.work.web_work_on_class;

import com.work.web_work_on_class.service.GroupIJoinService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GroupIJoinTest {
    @Autowired
    private GroupIJoinService groupIJoinService;

    @Test
    public void testGetGroupIJoin(){
        System.out.println(groupIJoinService.getGroupIJoin(1).toString());
    }
}
