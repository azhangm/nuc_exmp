package nuc.zm.nuc_zm_mybatis.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItemsServiceImplTest {

    @Autowired
    private ItemsService itemsService;

    @Test
    void testGetAll(){
        itemsService.getAll();
    }
}