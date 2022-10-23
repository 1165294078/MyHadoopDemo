import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import zjc.Mapper.DataMapper;
import zjc.pojo.Datas;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SelectTest2 {
    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //获取工厂对象
        SqlSession sqlSession= sqlSessionFactory.openSession();


        DataMapper datasMapper=sqlSession.getMapper(DataMapper.class);


       List<Datas> datas= datasMapper.selectAll();


        System.out.println(datas);

        sqlSession.close();
    }
}
