package Services;

import Domain.Group;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public interface GroupService {
    Group create(Group group);

    Group read(String groupId);

    Group update(Group group);

    void delete(String groupId);
}
