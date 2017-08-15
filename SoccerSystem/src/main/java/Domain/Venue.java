package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Venue implements Serializable{

    private String venueId;
    private String location;
    private String date;
    private int durationInMinutes;
    private String fkFixtureId;



    public String getVenueId() {
        return venueId;
    }

    public String getLocation() {
        return location;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getFkFixtureId() {
        return fkFixtureId;
    }

    private Venue(){}

    public Venue(Builder builder)
    {
        this.venueId = builder.venueId;
        this.location = builder.location;
        this.date = builder.date;
        this.durationInMinutes = builder.durationInMinutes;
        this.fkFixtureId = builder.fkFixtureId;
    }

    public static class Builder
    {
        private String venueId;
        private String location;
        private String date;
        private int durationInMinutes;
        private String fkFixtureId;


        public Builder venueId(String value)
        {
            this.venueId = value;
            return this;
        }

        public Builder location(String value)
        {
            this.location = value;
            return this;
        }

        public Builder date(String value)
        {
            this.date = value;
            return this;
        }

        public Builder durationInMinutes(int value)
        {
            this.durationInMinutes = value;
            return this;
        }

        public Builder fkFixtureId(String value)
        {
            this.fkFixtureId = value;
            return this;
        }

        public Venue build(){return new Venue(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Venue venue = (Venue) o;
            return venueId.equals(venue.venueId);
        }

        public int hashCode()
        {
            return venueId.hashCode();
        }
    }
}
