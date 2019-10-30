package cn.wolfcode.lcn.service.impl;

import cn.wolfcode.lcn.mapper.IntegralMapper;
import cn.wolfcode.lcn.service.IIntegralService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wolfcode-lanxw
 */
@Service
public class IntegralServiceImpl implements IIntegralService {
    @Autowired
    private IntegralMapper integralMapper;
    @Transactional
    @Override
    public void addIntegral(Long userId, int integral) {
        integralMapper.addIntegral(userId,integral);
    }
}
