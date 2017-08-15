package Services.Impl;

import Domain.Venue;
import Repositories.Impl.VenueRepositoryImpl;
import Repositories.VenueRepository;
import Services.VenueService;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class VenueServiceImpl implements VenueService{

    private static VenueServiceImpl service = null;

    VenueRepository repository = VenueRepositoryImpl.getInstance();

    public static VenueServiceImpl getInstance()
    {
        if (service == null)
            service = new VenueServiceImpl();
        return service;
    }

    public Venue create(Venue venue)
    {
        return repository.create(venue);
    }

    public Venue read(String venueId)
    {
        return repository.read(venueId);
    }

    public Venue update(Venue venue)
    {
        return repository.update(venue);
    }

    public void delete(String venueId)
    {
        repository.delete(venueId);
    }
}
