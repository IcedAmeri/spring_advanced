package hello.aop.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    private final  OrderRespository orderRespository;

    public OrderService(OrderRespository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public void orderItem(String itemId) {
        log.info("[orderService] 실행");
        orderRespository.save(itemId);
    }
}
