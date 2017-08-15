package Factories;

import Domain.Group;

import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class GroupFactory {

    public static Group getGroup(Map<String, String> values, String fkTeamId) {
        Group group = new Group.Builder()
                .fkTeamId(values.get("fkTeamId"))
                .groupId(values.get("groupId"))
                .teamName(values.get("teamName"))
                .build();

        return group;
    }
}
