package cn.wolfcode.lcn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * Created by wolfcode-lanxw
 */
@Mapper
public interface IntegralMapper {
    @Update("update t_integral set count = count + #{integral} where user_id = #{userId}")
    int addIntegral(@Param("userId") Long userId, @Param("integral") int integral);
}
