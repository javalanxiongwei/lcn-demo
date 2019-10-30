package cn.wolfcode.lcn.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wolfcode-lanxw
 * 用户订单对象
 */
@Setter@Getter
public class OrderInfo implements Serializable {
    private String orderNo;//订单编号
    private Long userId;//用户id
    private int price;//支付价格
    private int status;//订单状态
}
