package Domain;

/**
 * Created by L.z Double E on 8/7/2017.
 */
public class Staff implements Serializable{

    private String staffNo;
    private String firstname;
    private String lastname;
    private String role;
    private int age;
    private String fkTeamId;


    public String getStaffNo() {
        return staffNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public String getFkTeamId() {
        return fkTeamId;
    }

    private Staff(){}

    public Staff(Builder builder)
    {
        this.staffNo = builder.staffNo;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.role = builder.role;
        this.fkTeamId = builder.fkTeamId;
    }

    public static class Builder
    {
        private String staffNo;
        private String firstname;
        private String lastname;
        private String role;
        private int age;
        private String fkTeamId;


        public Builder staffNo(String value)
        {
            this.staffNo = value;
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

        public Builder role(String value)
        {
            this.role = value;
            return this;
        }

        public Builder age(int value)
        {
            this.age = value;
            return this;
        }

        public Builder fkTeamId(String value)
        {
            this.fkTeamId= value;
            return this;
        }

        public Staff build(){return new Staff(this);}

        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Staff staff = (Staff) o;
            return staffNo.equals(staff.staffNo);
        }

        public int hashCode()
        {
            return staffNo.hashCode();
        }
    }
}
