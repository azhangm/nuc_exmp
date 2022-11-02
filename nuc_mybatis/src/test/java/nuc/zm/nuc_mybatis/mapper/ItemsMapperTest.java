package nuc.zm.nuc_mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ItemsMapperTest {

    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    void deleteByPrimaryKey() {

    }

    @Test
    void insert() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
        itemsMapper.selectByPrimaryKey(1);
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }
}