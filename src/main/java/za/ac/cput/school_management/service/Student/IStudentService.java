/**
 * Athini Mbiko
 * 213196379
 * Student Service
 */
package za.ac.cput.school_management.service.Student;
import za.ac.cput.school_management.domain.Student;
import za.ac.cput.school_management.service.IService;

import java.util.List;
import java.util.Optional;

public interface IStudentService extends IService<Student, String> {
    //Using your knowledge of Facade design pattern, implement a service to retrieve a list containing
    //the last name of all the students in the same country, given a country id
    List<Student> findLastnameByCountryId(String countryId);
}
