package Repositories.Impl;

import Domain.Staff;
import Repositories.StaffRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class StaffRepositoryImpl implements StaffRepository {

    private static StaffRepositoryImpl repository = null;

    private Map<String, Staff> staffTable;

    private StaffRepositoryImpl()
    {
        staffTable = new HashMap<String, Staff>();
    }

    public static StaffRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new StaffRepositoryImpl();
        return repository;
    }

    public Staff create(Staff staff)
    {
        staffTable.put(staff.getStaffNo(), staff);
        Staff savedStaff = staffTable.get(staff.getStaffNo());

        return savedStaff;
    }

    public Staff read(String staffNo)
    {
        Staff staff = staffTable.get(staffNo);

        return staff;
    }

    public Staff update(Staff staff)
    {
        staffTable.put(staff.getStaffNo(), staff);
        Staff savedStaff = staffTable.get(staff.getStaffNo());

        return savedStaff;
    }

    public void delete(String staffNo)
    {
        staffTable.remove(staffNo);
    }

}
