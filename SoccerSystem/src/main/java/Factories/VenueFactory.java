package Factories;

import Domain.Venue;

import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class VenueFactory {

    public static Venue getVenue(Map<String, String> values, int durationInMinutes) {
        Venue venue = new Venue.Builder()
                .durationInMinutes(durationInMinutes)
                .venueId(values.get("venueId"))
                .location(values.get("location"))
                .date(values.get("date"))
                .fkFixtureId(values.get("fkFixtureId"))
                .build();

        return venue;
    }
}
