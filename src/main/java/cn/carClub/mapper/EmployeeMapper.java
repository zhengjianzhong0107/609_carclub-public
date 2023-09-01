package cn.carClub.mapper;

import cn.carClub.dto.AllService;
import cn.carClub.pojo.Employee;
import cn.carClub.pojo.Remind;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kuexun on 2018/6/19.
 */
@Repository
public interface EmployeeMapper {

    Employee findEmployee(@Param("username") String username, @Param("password") String password);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(String employeeId);

    int addEmployee(Employee employee);

    int deleteEmployee(String employeeId);

    int modifyEmployee(Employee employee);



    List<Remind> getAllRemind();

    List<Remind> getRemindByEmployeeId(String employeeId);

    Remind getRemindByRemindId(String remindId);

    int addRemind(Remind remind);

    int deleteRemind(String remindId);

    int modifyRemind(Remind remind);


    List<AllService> getAllTrainService();

    List<AllService> getAllRescueService();

    List<AllService> getAllTravelService();
}
