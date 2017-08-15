package Factories;

import Domain.Venue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class VenueFactoryTest {
    Map<String,String> values;
    @BeforeMethod
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("venueId","RA");
        values.put("location","Rosebank");
        values.put("fkFixtureId","M1");
        values.put("date","26 Aug 2017");

    }

    @Test
    public void testGetVenue() throws Exception {
        Venue venue = VenueFactory.getVenue(values, 120);
        assertEquals("RA", venue.getVenueId());

    }

}