package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Group implements Serializable{

    private String groupId;
    private String teamName;
    private String fkTeamId;


    public String getGroupId() {
        return groupId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getFkTeamId() {
        return fkTeamId;
    }

    private Group(){}

    public Group(Builder builder)
    {
        this.groupId = builder.groupId;
        this.teamName = builder.teamName;
        this.fkTeamId = builder.fkTeamId;
    }

    public static class Builder
    {
        private String groupId;
        private String teamName;
        private String fkTeamId;


        public Builder groupId(String value)
        {
            this.groupId = value;
            return this;
        }

        public Builder teamName(String value)
        {
            this.teamName = value;
            return this;
        }

        public Builder fkTeamId(String value)
        {
            this.fkTeamId = value;
            return this;
        }

        public Group build(){return new Group(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Group group = (Group) o;
            return groupId.equals(group.groupId);
        }

        public int hashCode()
        {
            return groupId.hashCode();
        }
    }
}
