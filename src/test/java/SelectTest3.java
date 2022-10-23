import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import zjc.Mapper.DataMapper;
import zjc.pojo.Datas;
import zjc.service.DataService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SelectTest3 {
    private DataService dataService=new DataService();
    @Test
    public void query() throws IOException {



        List<Datas> datas=dataService.selectAll();


        System.out.println(datas);


    }
}
