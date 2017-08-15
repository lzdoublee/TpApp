package Services;

import Domain.Venue;
import Factories.VenueFactory;
import Services.Impl.VenueServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class VenueServiceTest {

    Map<String, String> values;
    VenueService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new VenueServiceImpl();
        values = new HashMap<String, String>();
        values.put("venueId", "RA");
        values.put("location", "Rosebank");
        values.put("groupId", "26 Aug 2017");
        values.put("fkFixtureId", "M1");

    }

    @Test
    public void testCreate() throws Exception {
        Venue venue = VenueFactory.getVenue(values,120 );
        service.create(venue);
        assertEquals(120, venue.getDurationInMinutes());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Venue readVenue = service.read("RA");
        assertEquals(120, readVenue.getDurationInMinutes());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Venue venue = service.read("RA");
        Venue newVenue = new Venue.Builder()
                .venueId(values.get("teamName"))
                .location(values.get("location"))
                .date(values.get("date"))
                .durationInMinutes(120)
                .fkFixtureId(values.get("fkFixtureId"))
                .build();

        service.update(newVenue);
        Venue updatedVenue = service.read("RB");
        assertEquals(90,updatedVenue.getDurationInMinutes());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("RB");
        Venue venue = service.read("RB");
        assertNull(venue);
    }
}