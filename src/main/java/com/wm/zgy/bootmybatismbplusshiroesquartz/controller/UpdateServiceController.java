package com.wm.zgy.bootmybatismbplusshiroesquartz.controller;

import com.wm.zgy.bootmybatismbplusshiroesquartz.service.UpdateAgeTaskService;
import com.wm.zgy.bootmybatismbplusshiroesquartz.service.UpdateGenderTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/6/1 0:48
 * @Modified by:
 */
@RestController
@RequestMapping("updateservice")
public class UpdateServiceController {
    @Autowired
    private UpdateAgeTaskService updateAgeTaskService;

    @Autowired
    private UpdateGenderTaskService updateGenderTaskService;

    @RequestMapping("agegender")
    public String updateAgeGender() throws InterruptedException {
        updateAgeTaskService.updateAge();
        updateGenderTaskService.updateGender();
        return "提交了一个任务！";
    }


}
