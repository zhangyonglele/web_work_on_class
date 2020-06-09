package com.work.web_work_on_class;

import com.work.web_work_on_class.model.UserGroupRelation;
import com.work.web_work_on_class.service.UserGroupRelationService;
import com.work.web_work_on_class.service.combine.JoinGroupService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JoinNewProjectGroup {
    @Autowired
    JoinGroupService joinGroupService;


    @Test
    public void testJoinGroup(){
        System.out.println(joinGroupService.JoinGroup(1,"func@yeah.net"));
    }
}
