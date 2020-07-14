package com.bj.test05.om;

import com.bj.pojo.OrdersCustom;

import java.util.List;

public interface OrdersAndDetailMapper {

    //查询订单及订单明细的信息
    public List<OrdersCustom> find();

}
