package com.zhihuittu.sunbz.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sun
 * @since 2020-08-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Person{
//需要做映射并且最好使用驼峰命名
private static final long serialVersionUID=1L;

    /**
     * 员工id
     */
   // @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 性别 1=男 2= 女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 电话
     */
    private String tel_phone;

    /**
     * 部门id
     */
    private Integer dept_id;

    /**
     * 岗位名称
     */
    private String post_name;



}
