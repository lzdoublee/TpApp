package Services.Impl;

import Domain.Group;
import Repositories.GroupRepository;
import Repositories.Impl.GroupRepositoryImpl;
import Services.GroupService;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class GroupServiceImpl implements GroupService{


    private static GroupServiceImpl service = null;

    GroupRepository repository = GroupRepositoryImpl.getInstance();

    public static GroupServiceImpl getInstance()
    {
        if (service == null)
            service = new GroupServiceImpl();
        return service;
    }

    public Group create(Group group)
    {
        return repository.create(group);
    }

    public Group read(String groupId)
    {
        return repository.read(groupId);
    }

    public Group update(Group group)
    {
        return repository.update(group);
    }

    public void delete(String groupId)
    {
        repository.delete(groupId);
    }
}
