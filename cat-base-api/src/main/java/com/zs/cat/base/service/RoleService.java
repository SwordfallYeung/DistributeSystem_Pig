package com.zs.cat.base.service;

import com.zs.cat.base.entity.Role;
import com.zs.cat.commons.dao.PageData;

import java.util.List;

public interface RoleService {

    public List<Role> listAllERRoles() throws Exception;

    public List<Role> listAllappERRoles() throws Exception;


    public List<Role> listAllRoles() throws Exception;

    //通过当前登录用的角色id获取管理权限数据
    public PageData findGLbyrid(PageData pd) throws Exception;

    //通过当前登录用的角色id获取用户权限数据
    public PageData findYHbyrid(PageData pd) throws Exception;

    //列出此角色下的所有用户
    public List<PageData> listAllUByRid(PageData pd) throws Exception;

    //列出此角色下的所有会员
    public List<PageData> listAllAppUByRid(PageData pd) throws Exception;

    /**
     * 列出此部门的所有下级
     */
    public List<Role> listAllRolesByPId(PageData pd) throws Exception;

    //列出K权限表里的数据
    public List<PageData> listAllkefu(PageData pd) throws Exception;

    //列出G权限表里的数据
    public List<PageData> listAllGysQX(PageData pd) throws Exception;

    //删除K权限表里对应的数据
    public void deleteKeFuById(String ROLE_ID) throws Exception;

    //删除G权限表里对应的数据
    public void deleteGById(String ROLE_ID) throws Exception;

    public void deleteRoleById(String ROLE_ID) throws Exception;

    public Role getRoleById(String roleId) throws Exception;

    public void updateRoleRights(Role role) throws Exception;

    /**
     * 权限(增删改查)
     */
    public void updateQx(String msg, PageData pd) throws Exception;

    /**
     * 客服权限
     */
    public void updateKFQx(String msg, PageData pd) throws Exception;

    /**
     * Gc权限
     */
    public void gysqxc(String msg, PageData pd) throws Exception;

    /**
     * 给全部子职位加菜单权限
     */
    public void setAllRights(PageData pd) throws Exception;

    /**
     * 添加
     */
    public void add(PageData pd) throws Exception;

    /**
     * 保存客服权限
     */
    public void saveKeFu(PageData pd) throws Exception;

    /**
     * 保存G权限
     */
    public void saveGYSQX(PageData pd) throws Exception;

    /**
     * 通过id查找
     */
    public PageData findObjectById(PageData pd) throws Exception;

    /**
     * 编辑角色
     */
    public PageData edit(PageData pd) throws Exception;
}
