package kjistik.komodoback.Services.Order_backlogs;

import java.util.List;
import java.util.Optional;

import kjistik.komodoback.Models.OrderBacklog;

public interface Order_backlogService {
    
List<OrderBacklog> all();

Optional<OrderBacklog> one(Long id);

OrderBacklog newBacklog(OrderBacklog newBacklog);

OrderBacklog changeBacklog(Long id, OrderBacklog newBacklog);

}
