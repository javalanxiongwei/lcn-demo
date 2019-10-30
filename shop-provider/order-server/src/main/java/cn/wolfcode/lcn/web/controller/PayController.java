package cn.wolfcode.lcn.web.controller;

import cn.wolfcode.lcn.service.IOrderInfoService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wolfcode-lanxw
 */
@RestController
public class PayController {
    @Autowired
    private IOrderInfoService orderInfoService;
    @RequestMapping("/payOrder")
    public String payOrder(String orderNo){
        orderInfoService.payOrder(orderNo);//支付逻辑
        return "支付成功";
    }
}
