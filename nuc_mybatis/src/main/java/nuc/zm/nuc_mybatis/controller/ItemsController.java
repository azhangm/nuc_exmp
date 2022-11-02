package nuc.zm.nuc_mybatis.controller;

import nuc.zm.nuc_mybatis.pojo.Items;
import nuc.zm.nuc_mybatis.response.Res;
import nuc.zm.nuc_mybatis.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;
    @GetMapping()
   public String hello() {
        return "hello";
    }

    @GetMapping("/all/")
    public Res<List<Items>> getAll(){
        return new Res<>(service.getAll());
    }
}
