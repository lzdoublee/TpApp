package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class PlayerStats {

    private String id;
    private int goalsScored;
    private int caps;
    private String fkPlayerId;

    public String getId() {
        return id;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getCaps() {
        return caps;
    }

    public String getFkPlayerId() {
        return fkPlayerId;
    }


    private PlayerStats(){}

    public PlayerStats(Builder builder) {
        this.id = builder.id;
        this.goalsScored = builder.goalsScored;
        this.caps = builder.caps;
        this.fkPlayerId = builder.fkPlayerId;
    }

        public static class Builder {
            private String id;
            private int goalsScored;
            private int caps;
            private String fkPlayerId;



            public Builder id(String value) {
                this.id = value;
                return this;
            }

            public Builder goalsScored(int value) {
                this.goalsScored = value;
                return this;
            }

            public Builder caps(int value) {
                this.caps = value;
                return this;
            }

            public Builder fkPlayerId(String value) {
                this.fkPlayerId = value;
                return this;
            }

            public PlayerStats build() {return new PlayerStats(this);
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                PlayerStats playerStats = (PlayerStats) o;
                return id.equals(playerStats.id);
            }

            public int hashCode() {
                return id.hashCode();
            }
        }
}
