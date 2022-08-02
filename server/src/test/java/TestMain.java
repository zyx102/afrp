import com.afrp.api.TranCheckService;
import com.afrp.api.in.TranCheckIn;
import com.afrp.server.AppServer;
import com.afrp.server.common.service.AfRuleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppServer.class)
public class TestMain {
    @Autowired
    private TranCheckService tranCheckService;

    @Test
    public void test(){
        TranCheckIn in = new TranCheckIn();
        tranCheckService.checkRule(in);
    }
}
