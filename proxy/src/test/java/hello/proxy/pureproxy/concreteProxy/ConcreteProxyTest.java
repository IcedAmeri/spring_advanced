package hello.proxy.pureproxy.concreteProxy;


import hello.proxy.pureproxy.concreteProxy.code.ConcreteClient;
import hello.proxy.pureproxy.concreteProxy.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(concreteLogic);
        concreteClient.execute();
    }
}
