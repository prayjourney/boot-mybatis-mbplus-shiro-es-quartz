package com.zgy.learn.webtoken.controller;

import com.zgy.learn.webtoken.pojo.RoleAuthority;
import com.zgy.learn.webtoken.service.RoleAuthorityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RoleAuthority)表控制层
 *
 * @author makejava
 * @since 2021-02-01 00:58:23
 */
@RestController
@RequestMapping("roleAuthority")
public class RoleAuthorityController {
    /**
     * 服务对象
     */
    @Resource
    private RoleAuthorityService roleAuthorityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RoleAuthority selectOne(Integer id) {
        return this.roleAuthorityService.queryById(id);
    }

}