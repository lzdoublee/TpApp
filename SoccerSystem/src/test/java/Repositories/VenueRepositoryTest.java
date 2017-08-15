package Repositories;

import Domain.Venue;
import Factories.GroupFactory;
import Factories.VenueFactory;
import Repositories.Impl.VenueRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class VenueRepositoryTest {
    Map<String, String> values;
    VenueRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = VenueRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("venueId", "RA");
        values.put("location", "Rosebank");
        values.put("groupId", "26 Aug 2017");
        values.put("fkFixtureId", "M1");

    }

    @Test
    public void create() throws Exception {
        Venue venue = VenueFactory.getVenue(values, 120);
        repository.create(venue);
        assertEquals("RA", venue.getVenueId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Venue readVenue = repository.read("RA");
        assertEquals("RA", readVenue.getVenueId());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Venue venue = repository.read("RA");
        Venue newVenue = new Venue.Builder()
                .venueId(values.get("teamName"))
                .location(values.get("location"))
                .date(values.get("date"))
                .durationInMinutes(120)
                .fkFixtureId(values.get("fkFixtureId"))
                .build();

        repository.update(newVenue);
        Venue updatedVenue = repository.read("RA");
        assertEquals(120, updatedVenue.getDurationInMinutes());

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        repository.delete("RA");
        Venue venue = repository.read("RA");
        assertNull(venue);
    }

}