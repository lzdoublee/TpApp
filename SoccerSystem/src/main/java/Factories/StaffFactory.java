package Factories;

import Domain.Staff;

import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class StaffFactory {

    public static Staff getStaff(Map<String, String> values, int age) {
        Staff staff = new Staff.Builder()
                .age(age)
                .staffNo(values.get("staffNo"))
                .role(values.get("role"))
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .lastname(values.get("lastname"))
                .fkTeamId(values.get("fkTeamId"))
                .build();

        return staff;
    }
}
