package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class TeamStats {

    private String id;
    private int goalsScored;
    private int wins;
    private int losses;
    private int points;
    private int gamesPlayed;
    private String fkTeamId;

    public String getId() {
        return id;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getPoints() {
        return points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String getFkTeamId() {
        return fkTeamId;
    }


    private TeamStats(){}

    public TeamStats(Builder builder) {
        this.id = builder.id;
        this.goalsScored = builder.goalsScored;
        this.wins = builder.wins;
        this.losses = builder.losses;
        this.points = builder.points;
        this.gamesPlayed = builder.gamesPlayed;
        this.fkTeamId = builder.fkTeamId;
    }

    public static class Builder {


        private String id;
        private int goalsScored;
        private int wins;
        private int losses;
        private int points;
        private int gamesPlayed;
        private String fkTeamId;



        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder goalsScored(int value) {
            this.goalsScored = value;
            return this;
        }

        public Builder wins(int value) {
            this.wins = value;
            return this;
        }

        public Builder losses(int value) {
            this.losses = value;
            return this;
        }

        public Builder points(int value) {
            this.points = value;
            return this;
        }

        public Builder gamesPlayed(int value) {
            this.gamesPlayed = value;
            return this;
        }

        public Builder fkTeamId(String value) {
            this.fkTeamId = value;
            return this;
        }

        public TeamStats build() {return new TeamStats(this);}

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TeamStats teamStats = (TeamStats) o;
            return id.equals(teamStats.id);
        }

        public int hashCode() {
            return id.hashCode();
        }
    }
}
