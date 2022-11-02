package nuc.zm.nuc_zm_mybatis.controller;

import nuc.zm.nuc_zm_mybatis.pojo.Items;
import nuc.zm.nuc_zm_mybatis.response.Res;
import nuc.zm.nuc_zm_mybatis.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;
    @GetMapping("/all")
    public Res getAll() {
        Items all = service.getAll();
        return Res.success(all);
    }
}
