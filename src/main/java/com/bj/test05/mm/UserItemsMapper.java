package com.bj.test05.mm;

import com.bj.pojo.UserCustom;

import java.util.List;

public interface UserItemsMapper {

    //查询用户及用户购买商品信息
    public List<UserCustom> find();

}
