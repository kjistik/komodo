package kjistik.komodo.Services.Client;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodo.Models.Client;
import kjistik.komodo.Repositories.ClientRepository;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    ClientRepository repo;

    @Override
    public List<Client> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Client> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Client newClient(Client newClient) {
        return repo.save(newClient);
    }

    @Override
    public Client changeClient(Long id, Client newClient) {

        return repo.findById(id)
                .map(client -> {
                    client.setClient_name(newClient.getClient_name());
                    client.setClient_lastName(newClient.getClient_lastName());
                    client.setClient_email(newClient.getClient_email());
                    client.setLocalidad(newClient.getLocalidad());
                    client.setClient_phone_ch(newClient.getClient_phone_ch());
                    client.setClient_phone(newClient.getClient_phone());
                    client.setClient_street(newClient.getClient_street());
                    client.setActive(newClient.isActive());
                    return repo.save(client);
                })
                .orElseGet(() -> {
                    newClient.setIdClient(id);
                    return repo.save(newClient);
                });
    }
}
