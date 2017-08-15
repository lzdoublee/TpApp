package Services;

import Domain.Staff;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public interface StaffService {
    Staff create(Staff staff);

    Staff read(String staffNo);

    Staff update(Staff staff);

    void delete(String staffNo);
}
