package bs2.cii.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;

import bs2.cii.service.gen.AddCIMInteractionRequest;
import bs2.cii.service.gen.InteractionRequest;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApplicationIntegrationTest {

    private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

    @LocalServerPort
    private int port = 0;

    @Before
    public void init() throws Exception {
        marshaller.setPackagesToScan(ClassUtils.getPackageName(AddCIMInteractionRequest.class));
        marshaller.afterPropertiesSet();
    }

    @Test
    public void whenSendRequest_thenResponseIsNotNull() {
        WebServiceTemplate ws = new WebServiceTemplate(marshaller);
        AddCIMInteractionRequest request = new AddCIMInteractionRequest();
        InteractionRequest r = new InteractionRequest();
        request.setInteractionRequest(r);

        assertThat(ws.marshalSendAndReceive("http://localhost:" + port + "/ws", request)).isNotNull();
    }
}
