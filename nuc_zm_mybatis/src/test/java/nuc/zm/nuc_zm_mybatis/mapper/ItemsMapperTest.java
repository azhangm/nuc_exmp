package nuc.zm.nuc_zm_mybatis.mapper;

import nuc.zm.nuc_zm_mybatis.pojo.Items;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemsMapperTest {

    @Autowired
    private ItemsMapper itemsMapper;
    @Test
    void selectAll() {

        System.out.println(itemsMapper);
        for (Method method : itemsMapper.getClass().getMethods()) {
            System.out.println(method.getName());
        }
//??????
//        itemsMapper.selectByPrimaryKey(1);
//        itemsMapper.
        itemsMapper.countByExample(null);
    }
}