package com.zhangjing.test;

import com.zhangjing.dao.ItemsDao;
import com.zhangjing.domain.Items;
import com.zhangjing.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author zhangjing9
 * @create 2020-06-04 16:07
 */
public class ItemsTest {

    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items item = itemsDao.findById(1);
        System.out.println(item.getName());

    }

    @Test
    public void findByIdFromService(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items item = itemsService.findById(1);
        System.out.println("service ===>"+item.getName());

    }
}
