package cn.wolfcode.lcn.web.feign;

import cn.wolfcode.lcn.domain.Integral;
import cn.wolfcode.lcn.feign.IntegralFeignApi;
import cn.wolfcode.lcn.service.IIntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wolfcode-lanxw
 */
@RestController
public class IntegralFeignClient implements IntegralFeignApi {
    @Autowired
    private IIntegralService iIntegralService;
    @Override
    public void addIntegral(Long userId, int intergral) {
        iIntegralService.addIntegral(userId,intergral);
    }
}
