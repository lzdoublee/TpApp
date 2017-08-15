package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Player implements Serializable{

    private String playerId;
    private String nickname;
    private String firstname;
    private String lastname;
    private int age;
    private String residence;
    private String fkTeamId;

    public String getPlayerId() {
        return playerId;
    }

    public String getNickName() {
        return nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getResidence() {
        return residence;
    }

    public int getAge() {
        return age;
    }

    public String getFkTeamId() {
        return fkTeamId;
    }

    private Player(){}

    public Player(Builder builder)
    {
        this.playerId = builder.playerId;
        this.nickname = builder.nickname;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.residence = builder.residence;
        this.fkTeamId = builder.fkTeamId;
    }

    public static class Builder
    {
        private String playerId;
        private String nickname;
        private String firstname;
        private String lastname;
        private int age;
        private String residence;
        private String fkTeamId;


        public Builder playerId(String value)
        {
            this.playerId= value;
            return this;
        }

        public Builder nickname(String value)
        {
            this.nickname= value;
            return this;
        }

        public Builder firstname(String value)
        {
            this.firstname = value;
            return this;
        }

        public Builder lastname(String value)
        {
            this.lastname = value;
            return this;
        }

        public Builder age(int value)
        {
            this.age = value;
            return this;
        }

        public Builder residence(String value)
        {
            this.residence = value;
            return this;
        }

        public Builder fkTeamId(String value)
        {
            this.fkTeamId= value;
            return this;
        }

        public Player build(){return new Player(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Player player = (Player) o;
            return playerId.equals(player.playerId);
        }

        public int hashCode()
        {
            return playerId.hashCode();
        }
    }
}
