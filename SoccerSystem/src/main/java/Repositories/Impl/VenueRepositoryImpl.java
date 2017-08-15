package Repositories.Impl;

import Domain.Venue;
import Repositories.VenueRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class VenueRepositoryImpl implements VenueRepository{

    private static VenueRepositoryImpl repository = null;

    private Map<String, Venue> venueTable;

    private VenueRepositoryImpl()
    {
        venueTable = new HashMap<String, Venue>();
    }

    public static VenueRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new VenueRepositoryImpl();
        return repository;
    }

    public Venue create(Venue venue)
    {
        venueTable.put(venue.getVenueId(), venue);
        Venue savedVenue = venueTable.get(venue.getVenueId());

        return savedVenue;
    }

    public Venue read(String venueId)
    {
        Venue venue = venueTable.get(venueId);

        return venue;
    }

    public Venue update(Venue venue)
    {
        venueTable.put(venue.getVenueId(), venue);
        Venue savedVenue = venueTable.get(venue.getVenueId());

        return savedVenue;
    }

    public void delete(String venueId)
    {
        venueTable.remove(venueId);
    }


}
