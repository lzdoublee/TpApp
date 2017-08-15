package Repositories;

import Domain.Staff;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public interface StaffRepository {
    Staff create(Staff staff);

    Staff read(String staffNo);

    Staff update(Staff staff);

    void delete(String staffNo);
}
