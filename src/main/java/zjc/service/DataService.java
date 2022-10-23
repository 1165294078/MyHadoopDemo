package zjc.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import zjc.Mapper.DataMapper;
import zjc.pojo.Datas;
import zjc.util.SqlSessionFactoryUtils;

import java.util.List;

public class DataService {
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();



    public List<Datas> selectAll(){

        SqlSession sqlSession=factory.openSession();


        DataMapper datasMapper=sqlSession.getMapper(DataMapper.class);


        List<Datas> datas= datasMapper.selectAll();



        sqlSession.close();

        return datas;

    }

}
