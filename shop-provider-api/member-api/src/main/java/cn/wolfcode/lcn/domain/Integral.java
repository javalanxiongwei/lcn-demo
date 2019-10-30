package cn.wolfcode.lcn.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by wolfcode-lanxw
 * 用户积分实体
 */
@Setter@Getter
public class Integral implements Serializable {
    private Long userId;//用户ID
    private int count;//用户积分总数
}
