package cn.wolfcode.lcn.mapper;

import cn.wolfcode.lcn.domain.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

/**
 * Created by wolfcode-lanxw
 */
@Mapper
public interface OrderInfoMapper {
    @Select("select * from t_order where order_no = #{orderNo}")
    OrderInfo find(String orderNo);
    @Update("update t_order set status = #{status} where order_no = #{orderNo}")
    int updatePayStatus(@Param("orderNo") String orderNo,@Param("status") int status);
}
