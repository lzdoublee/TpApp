package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Tournament {

    private String tournamentId;
    private String startDate;
    private String endDate;
    private String name;
    private int teams;
    private String fkGroupId;


    public String getTournamentId() {
        return tournamentId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStaffNo() {
        return name;
    }

    public int getTeams() {
        return teams;
    }

    public String getFkGroupId() {
        return fkGroupId;
    }

    private Tournament(){}

    public Tournament(Builder builder)
    {
        this.tournamentId = builder.tournamentId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.name = builder.name;
        this.teams = builder.teams;
        this.fkGroupId = builder.fkGroupId;
    }

    public static class Builder
    {
        private String tournamentId;
        private String startDate;
        private String endDate;
        private String name;
        private int teams;
        private String fkGroupId;


        public Builder tournamentId(String value)
        {
            this.tournamentId = value;
            return this;
        }
        public Builder startDate(String value)
        {
            this.startDate = value;
            return this;
        }
        public Builder endDate(String value)
        {
            this.endDate = value;
            return this;
        }
        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder teams(int value)
        {
            this.teams = value;
            return this;
        }

        public Builder fkGroupId(String value)
        {
            this.fkGroupId= value;
            return this;
        }

        public Tournament build(){return new Tournament(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Tournament tournament = (Tournament) o;
            return tournamentId.equals(tournament.tournamentId);
        }

        public int hashCode()
        {
            return tournamentId.hashCode();
        }
    }
}
