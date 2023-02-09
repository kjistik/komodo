package kjistik.komodoback.Services.Clients;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodoback.Models.Clients;
import kjistik.komodoback.Repositories.ClientsRepository;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    ClientsRepository repo;

    public List<Clients> all() {
        return repo.findAll();
    }

    public Optional<Clients> one(Long id) {
        return repo.findById(id);
    }

    public Clients newClient(Clients newClient) {
        return repo.save(newClient);
    }

    public Clients changeClient(Long id, Clients newClient) {

        return repo.findById(id)
                .map(client -> {
                    client.setActive(newClient.isActive());
                    client.setClient_address(newClient.getClient_address());
                    client.setClient_city(newClient.getClient_city());
                    client.setClient_lastName(newClient.getClient_lastName());
                    client.setClient_mail(newClient.getClient_mail());
                    client.setClient_name(newClient.getClient_name());
                    client.setClient_phone(newClient.getClient_phone());
                    return repo.save(client);
                })
                .orElseGet(() -> {
                    newClient.setId_clients(id);
                    return repo.save(newClient);
                });

    }

}