package nuc.zm.nuc_mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * items
 * @author 
 */
@Data
public class Items implements Serializable {
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品定价
     */
    private Double price;

    /**
     * 商品描述
     */
    private String detail;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 生产日期
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;
}