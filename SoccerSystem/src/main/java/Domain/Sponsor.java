package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Sponsor {

    private String sponsorId;
    private String name;
    private String location;
    private int teams;



    public String getSponsorId() {
        return sponsorId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTeams() {
        return teams;
    }

    private Sponsor(){}

    public Sponsor(Builder builder)
    {
        this.sponsorId = builder.sponsorId;
        this.name = builder.name;
        this.location = builder.location;
        this.teams = builder.teams;
    }

    public static class Builder
    {
        private String sponsorId;
        private String name;
        private String location;
        private int teams;


        public Builder sponsorId(String value)
        {
            this.sponsorId = value;
            return this;
        }

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder location(String value)
        {
            this.location = value;
            return this;
        }

        public Builder teams(int value) {
            this.teams = value;
            return this;
        }

        public Sponsor build(){return new Sponsor(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Sponsor sponsor = (Sponsor) o;
            return sponsorId.equals(sponsor.sponsorId);
        }

        public int hashCode()
        {
            return sponsorId.hashCode();
        }
    }
}
