package com.zs.cat.cms.service.impl;

import com.zs.cat.cms.api.service.PeopleService;
import com.zs.cat.commons.dao.DaoSupport;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /*
    * 新增
    */
    public void save(PageData pd) throws Exception {
        dao.save("PeopleMapper.save", pd);
    }

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception {
        dao.delete("PeopleMapper.delete", pd);
    }

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception {
        dao.update("PeopleMapper.edit", pd);
    }

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) dao.findForList("PeopleMapper.datalistPage", page);
    }

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("PeopleMapper.listAll", pd);
    }

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dao.findForObject("PeopleMapper.findById", pd);
    }

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        dao.delete("PeopleMapper.deleteAll", ArrayDATA_IDS);
    }

}

