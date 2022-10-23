package zjc.web;


import org.apache.avro.data.Json;
import zjc.pojo.Datas;
import zjc.service.DataService;
import com.alibaba.fastjson.JSON;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll")
public class SelectAllServlet extends HttpServlet {

    private DataService dataService=new DataService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Datas> datas=dataService.selectAll();

        String js=JSON.toJSONString(datas);

        System.out.println("查询所有");

        resp.setContentType("text/json;charset=utf-8");

        resp.getWriter().write(js);


/*aaa*/

  /*      bbb*/

   /*     ddd*/

    /*    ccc*/
        
         /*   github 更新*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
