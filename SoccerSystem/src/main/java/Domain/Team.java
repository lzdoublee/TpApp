package Domain;


/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Team implements Serializable{
    private String teamId;
    private String name;
    private String manager;
    private int players;
    private String location;

    public String getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getPlayers() {
        return players;
    }

    public String getLocation() {
        return location;
    }

    private Team(){}

    public Team(Builder builder)
    {
        this.teamId = builder.teamId;
        this.name = builder.name;
        this.manager = builder.manager;
        this.players = builder.players;
        this.location = builder.location;
    }

    public static class Builder
    {
        private String teamId;
        private String name;
        private String manager;
        private int players;
        private String location;


        public Builder teamId(String value)
        {
            this.teamId= value;
            return this;
        }

        public Builder name(String value)
        {
            this.name= value;
            return this;
        }

        public Builder manager(String value)
        {
            this.manager = value;
            return this;
        }

        public Builder players(int value)
        {
            this.players= value;
            return this;
        }

        public Builder location(String value)
        {
            this.location= value;
            return this;
        }

        public Team build(){return new Team(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Team team = (Team) o;
            return teamId.equals(team.teamId);
        }

        public int hashCode()
        {
            return teamId.hashCode();
        }
    }


}





