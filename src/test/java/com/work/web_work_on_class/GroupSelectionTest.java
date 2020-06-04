package com.work.web_work_on_class;

import com.work.web_work_on_class.mapper.ProjectGroupMapper;
import com.work.web_work_on_class.service.ProjectGroupService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GroupSelectionTest {
    @Autowired
    private ProjectGroupService projectGroupService;

    @Test
    public void  testGetGroupByCreator(){
        System.out.println(projectGroupService.getGroupByCreatorId(1).toString());

    }
}
