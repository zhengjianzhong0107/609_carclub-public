package cn.carClub.controller;

import cn.carClub.dto.AllService;
import cn.carClub.dto.TrainTmp;
import cn.carClub.dto.excelData.AllServiceExcel;
import cn.carClub.pojo.*;
import cn.carClub.service.EmployeeService;
import cn.carClub.service.MemberService;
import cn.carClub.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户控制器
 * 1、跳转到登录界面
 * 2、判断账号密码正确性
 * 3、
 * Created by Kuexun on 2018/6/17.
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private MemberService memberService;

    /**
     * 登录控制
     * @param session
     * @return
     */
    @RequestMapping(value="/login")
    public String login(HttpSession session)
    {
//        System.out.println("aaaaaaaa");

        Employee employee = (Employee) session.getAttribute("employee");
        if(employee != null)
        {
            return "index";
        }
        return "login";
    }
    @RequestMapping(value="/logout")
    public String logout(HttpSession session)
    {
        Employee employee = null;
        session.setAttribute("employee",employee);
        session.setMaxInactiveInterval(0);
        return "login";
    }
    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request,HttpSession session,Model model) {

        Employee employee = (Employee) session.getAttribute("employee");
        if(employee == null)
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if ((username != null && !username.equals("")) && (password!=null && !password.equals(""))) {
                employee = employeeService.login(username, password);
            }
            if (employee == null) {
                System.out.println("没有员工，返回登录界面");
                return "login";
            }
            session.setAttribute("employee", employee);
        }
        List<TrainTmp> trainList = memberService.getAllTrain();
        List<Rescue> rescueList = memberService.getAllRescue();
        List<Travel> travelList = memberService.getAllTravel();
        model.addAttribute("trainList",trainList);
        model.addAttribute("rescueList",rescueList);
        model.addAttribute("travelList",travelList);
        System.out.println("找到员工了");
        return "index";
    }

    /**
     * 用户管理 查增删改
     * @return
     */
    @RequestMapping("/user/modify")
    @ResponseBody
    public String modifyUser(Employee employee,HttpSession session)
    {
        System.out.println(employee);
        int i = employeeService.modifyEmployee(employee);

        session.setAttribute("employee", employee);
        if(i != -1)
        {
            System.out.println("successfully modify!!!");
        }
        return "success";
    }
    @RequestMapping("/userInfo")
    public String getEmployee(Model model,HttpSession session)
    {
        Employee employee = (Employee) session.getAttribute("employee");
        System.out.println(employee);
        model.addAttribute("employee",employee);
        return "userInfo";
    }
    @RequestMapping("/employee")
    public String getAllEmployee(Model model)
    {
        List<Employee> employeeList= employeeService.getAllEmployee();
        model.addAttribute("employeeList",employeeList);
        return "employee";
    }

    @RequestMapping("/employee/{id}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable("id") String employeeId)
    {
        Employee employee = employeeService.getEmployeeById(employeeId);
        System.out.println(employee);
        return employee;
    }

    @RequestMapping("/employee/add")
    @ResponseBody
    public String addEmployee(Employee employee)
    {
        employee.setEmployeePower("0");
        System.out.println(employee);
        int i = employeeService.addEmployee(employee);
        if(i != -1)
        {
            System.out.println("successfully add!!!");
        }
        return "success";
    }

    @RequestMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable("id") String employeeId)
    {
        int i = employeeService.deleteEmployee(employeeId);
        if(i != -1)
        {
            System.out.println("successfully delete!!!");
        }
        return "employee";
    }

    @RequestMapping("/employee/modify")
    @ResponseBody
    public String modifyEmployee(Employee employee)
    {
        System.out.println(employee);
        int i = employeeService.modifyEmployee(employee);
        if(i != -1)
        {
            System.out.println("successfully modify!!!");
        }
        return "success";
    }

    /**
     * 提醒服务，提醒内容归私人拥有 查增删改
     */
    @RequestMapping("/remind")
    public String getAllRemind(Model model,HttpSession session)
    {
        Employee employee = (Employee) session.getAttribute("employee");
        String employeeId = employee.getEmployeeId();
        List<Remind> remindList= employeeService.getRemindByEmployeeId(employeeId);
        model.addAttribute("remindList",remindList);
        return "remind";
    }
    @RequestMapping("/remind/{id}")
    @ResponseBody
    public Remind getRemindByRemindId(@PathVariable("id") String remindId)
    {
        System.out.print(remindId);
        Remind r = employeeService.getRemindByRemindId(remindId);
        System.out.println(r);
        return r;
    }

    @RequestMapping("/remind/add")
    @ResponseBody
    public String addRemind(Remind remind)
    {
        System.out.println(remind);
        int i = employeeService.addRemind(remind);
        if(i != -1)
        {
            System.out.println("successfully add!!!");
        }
        return "success";
    }

    @RequestMapping("/remind/delete/{id}")
    @ResponseBody
    public String deleteRemind(@PathVariable("id") String remindId)
    {
        int i = employeeService.deleteRemind(remindId);
        if(i != -1)
        {
            System.out.println("successfully delete!!!");
        }
        return "success";
    }

    @RequestMapping("remind/modify")
    @ResponseBody
    public String modifyRemind(Remind remind)
    {
        System.out.println(remind);
        int i = employeeService.modifyRemind(remind);
        if(i != -1)
        {
            System.out.println("successfully modify!!!");
        }
        return "success";
    }



    @RequestMapping("/report")
    public String report(Model model)
    {
        System.out.println("getAllService");
        List<AllService> allServices = employeeService.getAllService();
        model.addAttribute("allServices",allServices);
        return "report";
    }

    @RequestMapping("/toServiceExcel")
    @ResponseBody
    public String toExcel()
    {
        AllServiceExcel serviceExcel = new AllServiceExcel("D://carClub//allServices.xls","services");
        serviceExcel.setColValue(employeeService.getAllService());
        ExcelUtils.makeExcel(serviceExcel);
        return "success";
    }
}
