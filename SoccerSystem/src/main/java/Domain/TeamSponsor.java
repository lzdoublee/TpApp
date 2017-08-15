package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class TeamSponsor implements Serializable{

    private String location;
    private String fkSponsorId;
    private String fkTeamId;

    public String getFkSponsorId() {
        return fkSponsorId;
    }

    public String getLocation() {
        return location;
    }

    public String fkTeamId() {return fkTeamId; }

    private TeamSponsor(){}

    public TeamSponsor(Builder builder)
    {

        this.location = builder.location;
        this.fkSponsorId = builder.fkSponsorId;
        this.fkTeamId = builder.fkTeamId;
    }

    public static class Builder
    {
        private String location;
        private String fkSponsorId;
        private String fkTeamId;

        public Builder location(String value)
        {
            this.location = value;
            return this;
        }

        public Builder fkSponsorId(String value)
        {
            this.fkSponsorId = value;
            return this;
        }

        public Builder fkTeamId(String value)
        {
            this.fkTeamId = value;
            return this;
        }

        public TeamSponsor build(){return new TeamSponsor(this);}
    }
}
