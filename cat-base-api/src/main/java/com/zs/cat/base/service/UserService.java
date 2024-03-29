package com.zs.cat.base.service;

import com.zs.cat.base.entity.User;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;

import java.util.List;


public interface UserService {

    /*
    * 通过id获取数据
    */
    public PageData findByUiId(PageData pd) throws Exception;

    /*
    * 通过loginname获取数据
    */
    public PageData findByUId(PageData pd) throws Exception;

    /*
    * 通过邮箱获取数据
    */
    public PageData findByUE(PageData pd) throws Exception;

    /*
    * 通过编号获取数据
    */
    public PageData findByUN(PageData pd) throws Exception;

    /*
    * 保存用户
    */
    public void saveU(PageData pd) throws Exception;

    /*
    * 修改用户
    */
    public void editU(PageData pd) throws Exception;

    /*
    * 换皮肤
    */
    public void setSKIN(PageData pd) throws Exception;

    /*
    * 删除用户
    */
    public void deleteU(PageData pd) throws Exception;

    /*
    * 批量删除用户
    */
    public void deleteAllU(String[] USER_IDS) throws Exception;

    /*
    *用户列表(用户组)
    */
    public List<PageData> listPdPageUser(Page page) throws Exception;

    /*
    *用户列表(全部)
    */
    public List<PageData> listAllUser(PageData pd) throws Exception;

    /*
    *用户列表(供应商用户)
    */
    public List<PageData> listGPdPageUser(Page page) throws Exception;

    /*
    * 保存用户IP
    */
    public void saveIP(PageData pd) throws Exception;

    /*
    * 登录判断
    */
    public PageData getUserByNameAndPwd(PageData pd) throws Exception;

    /*
    * 跟新登录时间
    */
    public void updateLastLogin(PageData pd) throws Exception;

    /*
    *通过id获取数据
    */
    public User getUserAndRoleById(String USER_ID) throws Exception;

}
