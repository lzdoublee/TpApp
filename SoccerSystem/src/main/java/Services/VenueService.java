package Services;

import Domain.Venue;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public interface VenueService {

    Venue create(Venue venue);

    Venue read(String venueId);

    Venue update(Venue venue);

    void delete(String venueId);
}
