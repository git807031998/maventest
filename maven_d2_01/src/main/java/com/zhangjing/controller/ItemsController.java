package com.zhangjing.controller;

import com.zhangjing.domain.Items;
import com.zhangjing.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangjing9
 * @create 2020-06-05 12:59
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items item = itemsService.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
