import com.rabbitmq.Application;
import com.rabbitmq.rabbitproducer.RabbitProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: rabbitmq
 * @description: 单元测试
 * @author: caicy
 * @create: 2019-07-20 10:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class JunitTest {

    @Autowired
    private RabbitProducer rabbitProducer;

    @Test
    public void testStringSend() {
        for (int i = 0; i < 10; i++) {
            rabbitProducer.stringSend();
        }
    }

    @Test
    public void testFanoutSend() {
        rabbitProducer.fanoutSend();
    }

    @Test
    public void testTopic() {
        rabbitProducer.topicTopic1Send();
        rabbitProducer.topicTopic2Send();
        rabbitProducer.topicTopic3Send();
    }

}
