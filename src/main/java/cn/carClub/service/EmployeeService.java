package cn.carClub.service;

import cn.carClub.dto.AllService;
import cn.carClub.mapper.EmployeeMapper;
import cn.carClub.pojo.Employee;
import cn.carClub.pojo.Remind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuexun on 2018/6/19.
 */
@Service
public class EmployeeService {

//    @Resource(name = "employeeMapper")
    @Autowired
//    @Qualifier("employeeMapper")
    private EmployeeMapper employeeMapper;

    public Employee login(String username, String password) {
        Employee employee = employeeMapper.findEmployee(username,password);
        System.out.println(employee);
        return employee;
    }

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    public Employee getEmployeeById(String employeeId) {
        return employeeMapper.getEmployeeById(employeeId);
    }

    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    public int deleteEmployee(String employeeId) {
        return employeeMapper.deleteEmployee(employeeId);
    }

    public int modifyEmployee(Employee employee) {
        return employeeMapper.modifyEmployee(employee);
    }




    public List<Remind> getRemindByEmployeeId(String employeeId) {
        return employeeMapper.getRemindByEmployeeId(employeeId);
    }

    public Remind getRemindByRemindId(String remindId) {
        return employeeMapper.getRemindByRemindId(remindId);
    }

    public int addRemind(Remind remind) {
        return employeeMapper.addRemind(remind);
    }

    public int deleteRemind(String remindId) {
        return employeeMapper.deleteRemind(remindId);
    }

    public int modifyRemind(Remind remind) {
        return employeeMapper.modifyRemind(remind);
    }





    public List<AllService> getAllService()
    {
        List<AllService> allService1 = employeeMapper.getAllTrainService();
        List<AllService> allService2 = employeeMapper.getAllRescueService();
        List<AllService> allService3 = employeeMapper.getAllTravelService();
//        System.out.println(allService2);
        List<AllService> allServices = new ArrayList<>();
        for(AllService allService:allService1)
        {
            if(allService.getServiceName() == null)
            {
                allService.setServiceName("车务代办");
            }
//            System.out.println(allService);
            allServices.add(allService);
        }
        for(AllService allService:allService2)
        {
            if(allService.getServiceName() == null)
            {
                allService.setServiceName("救援记录");
                allService.setServiceMessage("于"+allService.getServiceMessage()+"呼救");
            }
//            System.out.println(allService);
            allServices.add(allService);
        }
        for(AllService allService:allService3)
        {
            if(allService.getServiceName() == null)
            {
                allService.setServiceName("旅行服务");
                allService.setServiceMessage("到"+allService.getServiceMessage()+"旅游");
            }
//            System.out.println(allService);
            allServices.add(allService);
        }
        System.out.println(allServices);
        return allServices;
    }

}
