package com.work.web_work_on_class;

import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.service.ProjectGroupService;
import com.work.web_work_on_class.util.String2DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试GroupService 测试目标层：Service
 */
@SpringBootTest
public class GroupServiceTest {
    /**
     * 测试目标，ProjectGroupService
     */
    @Autowired
    private ProjectGroupService projectGroupService;

    /**
     * 测试方法：添加新小组
     */
    @Test
    public void addNewGroupTest(){
        ProjectGroup test = new ProjectGroup("test",
                String2DateUtils.parseDateStr("2020-5-3 12:00:00"),
                String2DateUtils.parseDateStr("2020-6-12 12:00:00"),
                1,
                1,
                "love you");
        projectGroupService.addNewGroup(test);
    }
}
