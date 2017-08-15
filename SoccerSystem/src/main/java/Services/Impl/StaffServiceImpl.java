package Services.Impl;

import Domain.Staff;
import Repositories.Impl.StaffRepositoryImpl;
import Repositories.StaffRepository;
import Services.StaffService;


/**
 * Created by L.z Double E on 8/15/2017.
 */
public class StaffServiceImpl implements StaffService{

    private static StaffServiceImpl service = null;

    StaffRepository repository = StaffRepositoryImpl.getInstance();

    public static StaffServiceImpl getInstance()
    {
        if (service == null)
            service = new StaffServiceImpl();
        return service;
    }

    public Staff create(Staff staff)
    {
        return repository.create(staff);
    }

    public Staff read(String staffNo)
    {
        return repository.read(staffNo);
    }

    public Staff update(Staff staff)
    {
        return repository.update(staff);
    }

    public void delete(String staffNo)
    {
        repository.delete(staffNo);
    }

}
