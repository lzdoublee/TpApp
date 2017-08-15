package Repositories;

import Domain.Group;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public interface GroupRepository {
    Group create(Group group);

    Group read(String groupId);

    Group update(Group group);

    void delete(String groupId);
}
