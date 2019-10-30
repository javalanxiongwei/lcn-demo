package cn.wolfcode.lcn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wolfcode-lanxw
 */
@FeignClient(name = "member-server")
public interface IntegralFeignApi {
    /**
     * 给指定用户增加指定的积分
     * @param userId
     * @param intergral
     */
    @RequestMapping("/addIntegral")
    void addIntegral(@RequestParam("userId") Long userId, @RequestParam("intergral")int intergral);
}
