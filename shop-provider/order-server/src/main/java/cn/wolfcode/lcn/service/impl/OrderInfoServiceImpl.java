package cn.wolfcode.lcn.service.impl;

import cn.wolfcode.lcn.domain.OrderInfo;
import cn.wolfcode.lcn.feign.IntegralFeignApi;
import cn.wolfcode.lcn.mapper.OrderInfoMapper;
import cn.wolfcode.lcn.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wolfcode-lanxw
 */
@Service
public class OrderInfoServiceImpl implements IOrderInfoService {
    @Autowired
    private IntegralFeignApi integralFeignApi;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Transactional
    @Override
    public void payOrder(String orderNo) {
        orderInfoMapper.updatePayStatus(orderNo,1);//更新订单状态
        OrderInfo orderInfo = orderInfoMapper.find(orderNo);//查询订单
        integralFeignApi.addIntegral(orderInfo.getUserId(),orderInfo.getPrice()/10);//给对应订单用户增加积分
    }
}
