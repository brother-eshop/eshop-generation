package com.cloud.sns.generation.common.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cloud.sns.generation.common.dao.GuidDao;
import com.cloud.sns.generation.entity.GuidItem;

/**
 * 
 * @ClassName  net.sns.generation.common.dao.impl.GuidDaoImpl
 * @description
 * @author : spencer
 * @Create Date : 2014-3-12 下午7:37:25
 */
@Repository("guidDao")
public class GuidDaoImpl extends GenericDaoImpl  implements GuidDao {

    /**
     * 获得GuidItem列表
     */
    @Override
    public List<GuidItem> getGuidItemByProject(String project) {
        return this.selectList("publicMapper.getsequence", project);
    }
    
    /**
     * 增加GuidItem
     */
    public void addGuidItem(GuidItem guidItem){
        this.insert("publicMapper.addsequence", guidItem);
    }
    
    /**
     * 更新GuidItem
     */
    public void updateGuidItem(GuidItem guidItem){
        this.update("publicMapper.updatesequence", guidItem);
    }
    
    
}
