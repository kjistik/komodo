package kjistik.komodoback.Services.Providers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodoback.Models.Provider;
import kjistik.komodoback.Repositories.ProviderRepository;

@Service
public class ProviderServiceImp implements ProviderService {

    @Autowired
    ProviderRepository repo;

    public List<Provider> all() {
        return repo.findAll();
    }

    public Optional<Provider> one(Long id) {
        return repo.findById(id);
    }

    public Provider change(Long id, Provider newProvider) {
        return repo.findById(id)
                .map(provider -> {
                    provider.setProvider_name(newProvider.getProvider_name());
                    provider.setActive(newProvider.isActive());
                    provider.setProvider_mail(newProvider.getProvider_mail());
                    provider.setProvider_city(newProvider.getProvider_city());
                    provider.setProvider_phone(newProvider.getProvider_phone());
                    provider.setProvider_adress(newProvider.getProvider_adress());
                    return repo.save(provider);
                })
                .orElseGet(() -> {
                    newProvider.setId_provider(id);
                    return repo.save(newProvider);
                });
    }

    public Provider newProvider(Provider newProvider) {
        return repo.save(newProvider);
    }
}