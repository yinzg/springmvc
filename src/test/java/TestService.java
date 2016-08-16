
import com.xy.service.NameService;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ziJun
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:context/test-beans.xml"})
public class TestService {

    @Resource
    private NameService nameService;

    @Test
    public void TestService() {
//        NameQa na = new NameQa();
//        na.setId(2);
//        na.setNameQa("kolk");
//        nameService.addQa(na);
        Long couot = nameService.getName("kolk", "ggggg");
        System.out.println("****************" + couot);
    }

}
