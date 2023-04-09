package kjistik.komodoback.Services.Order_backlogs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodoback.Models.OrderBacklog;
import kjistik.komodoback.Repositories.OrderBacklogRepository;

@Service
public class Order_backlogServiceImpl implements Order_backlogService {

    @Autowired
    OrderBacklogRepository repo;

    @Override
    public List<OrderBacklog> all() {
        return repo.findAll();
    }

    @Override
    public Optional<OrderBacklog> one(Long id) {

        return repo.findById(id);
    }

    @Override
    public OrderBacklog newBacklog(OrderBacklog newBacklog) {
        return repo.save(newBacklog);
    }

    @Override
    public OrderBacklog changeBacklog(Long id, OrderBacklog newBacklog) {
        return repo.findById(id)
        .map(backlog -> {
            backlog.setOrder_clients(newBacklog.getOrder_clients());
            backlog.setOrder_date(newBacklog.getOrder_date());
            backlog.setOrder_provider(newBacklog.getOrder_provider());
            backlog.setOrder_total_value(newBacklog.getOrder_total_value());
            return repo.save(backlog);
        })
        .orElseGet(() -> {
            newBacklog.setId_order(id);
            return repo.save(newBacklog);
        });
    }
}