package Repositories;

import Domain.Venue;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public interface VenueRepository {

    Venue create(Venue venue);

    Venue read(String venueId);

    Venue update(Venue venue);

    void delete(String venueId);
}
