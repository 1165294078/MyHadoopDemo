package zjc.Mapper;

import zjc.pojo.Datas;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface DataMapper {


    List<Datas> selectAll();


}
