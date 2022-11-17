package kjistik.komodo.Services.Client;

import java.util.List;
import java.util.Optional;

import kjistik.komodo.Models.Client;

public interface ClientService {
    List<Client> getAll();

    Optional<Client> one(Long id);

    Client newClient(Client newClient);

    Client changeClient(Long id, Client newClient);

}
