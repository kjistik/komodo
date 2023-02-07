package kjistik.komodoback.Services.Clients;

import java.util.List;
import java.util.Optional;

import kjistik.komodoback.Models.Clients;

public interface ClientService {

    List<Clients> all();

    Optional<Clients> one(Long id);

    Clients newClient(Clients newClient);

    Clients changeClient(Long id, Clients newCLient);

}
