package Repositories.Impl;

import Domain.Group;
import Repositories.GroupRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class GroupRepositoryImpl implements GroupRepository {

    private static GroupRepositoryImpl repository = null;

    private Map<String, Group> groupTable;

    private GroupRepositoryImpl()
    {
        groupTable = new HashMap<String, Group>();
    }

    public static GroupRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new GroupRepositoryImpl();
        return repository;
    }

    public Group create(Group group)
    {
        groupTable.put(group.getGroupId(), group);
        Group savedGroup = groupTable.get(group.getGroupId());

        return savedGroup;
    }

    public Group read(String groupId)
    {
        Group group = groupTable.get(groupId);

        return group;
    }

    public Group update(Group group)
    {
        groupTable.put(group.getGroupId(), group);
        Group savedGroup = groupTable.get(group.getGroupId());

        return savedGroup;
    }

    public void delete(String groupId)
    {
        groupTable.remove(groupId);
    }

}
