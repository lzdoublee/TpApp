package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Fixture implements Serializable{

    private String fixtureId;
    private String stage;
    private String date;
    private String fkTournamentId;

    public String getFixtureId() {
        return fixtureId;
    }

    public String getStage() {
        return stage;
    }

    public String getDate() {
        return date;
    }

    public String getFkTournamentId() {
        return fkTournamentId;
    }

    private Fixture(){}

    public Fixture(Builder builder)
    {
        this.fixtureId = builder.fixtureId;
        this.stage = builder.stage;
        this.date = builder.date;
        this.fkTournamentId = builder.fkTournamentId;
    }

    public static class Builder
    {
        private String fixtureId;
        private String stage;
        private String date;
        private String fkTournamentId;

        public Builder fixtureId(String value)
        {
            this.fixtureId = value;
            return this;
        }

        public Builder stage(String value)
        {
            this.stage = value;
            return this;
        }

        public Builder date(String value)
        {
            this.date = value;
            return this;
        }

        public Builder fkTournamentId(String value)
        {
            this.fkTournamentId = value;
            return this;
        }

        public Fixture build(){return new Fixture(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Fixture fixture = (Fixture) o;
            return fixtureId.equals(fixture.fixtureId);
        }

        public int hashCode()
        {
            return fixtureId.hashCode();
        }
    }
}
