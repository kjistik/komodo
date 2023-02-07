package kjistik.komodoback.Services.Providers;

import java.util.List;
import java.util.Optional;

import kjistik.komodoback.Models.Provider;

public interface ProviderService {

    List<Provider> all();

    Optional<Provider> one(Long id);

    Provider change(Long id, Provider newProvider);
}
