package com.zhangjing.service.impl;

import com.zhangjing.dao.ItemsDao;
import com.zhangjing.domain.Items;
import com.zhangjing.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangjing9
 * @create 2020-06-05 12:34
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
