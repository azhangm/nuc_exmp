package nuc.zm.nuc_zm_mybatis.service.impl;

import nuc.zm.nuc_zm_mybatis.mapper.ItemsMapper;
import nuc.zm.nuc_zm_mybatis.pojo.Items;
import nuc.zm.nuc_zm_mybatis.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 项目服务
 *
 * @author zm
 * @date 2022/11/02
 */

@Service
@Primary
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items getAll(){
        return itemsMapper.selectByPrimaryKey(1);
    }
}
