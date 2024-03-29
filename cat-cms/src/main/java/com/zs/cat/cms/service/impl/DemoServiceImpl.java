package com.zs.cat.cms.service.impl;

import com.zs.cat.cms.api.service.DemoService;
import com.zs.cat.commons.dao.DaoSupport;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /*
    * 新增
    */
    public void save(PageData pd) throws Exception {
        dao.save("DemoMapper.save", pd);
    }

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception {
        dao.delete("DemoMapper.delete", pd);
    }

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception {
        dao.update("DemoMapper.edit", pd);
    }

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) dao.findForList("DemoMapper.datalistPage", page);
    }

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("DemoMapper.listAll", pd);
    }

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dao.findForObject("DemoMapper.findById", pd);
    }

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        dao.delete("DemoMapper.deleteAll", ArrayDATA_IDS);
    }

}

