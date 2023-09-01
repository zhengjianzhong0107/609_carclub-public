package cn.carClub.controller;

import cn.carClub.dto.TrainTmp;
import cn.carClub.pojo.*;
import cn.carClub.service.EmployeeService;
import cn.carClub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 会员控制器，用于处理跟会员相关的事务
 *
 * Created by Kuexun on 2018/6/20.
 */
@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private EmployeeService employeeService;

    /**
     * 前端用于判断子选项卡的选中状态
     * @param index
     * @param session
     * @return
     */
    @RequestMapping("/aa")
    @ResponseBody
    public String getIndex(String index, HttpSession session)
    {
        System.out.println("index:"+index);
        int index2= Integer.valueOf(index);
        if(index2==9)
            index2=0;
        else
            index2=index2%2;
        session.setAttribute("index",index2);
        return "success";
    }

    /**
     * 车务信息管理（前端页面仅需添加车务）
     * @param model
     * @return
     */
    @RequestMapping("/train")
    public String getTrain(Model model, HttpSession session)
    {
//        String memberId = request.getParameter("memberId");
//        List<Train> trainList;
//        if(memberId == null)
//        {
//            trainList = memberService.getAllTrain();
//        }else {
//             trainList = memberService.getTrainByMemberId(memberId);
//        }
//        model.addAttribute("trainList",trainList);
//        System.out.println(trainList);

        Employee employee = (Employee) session.getAttribute("employee");
        String employeeId = employee.getEmployeeId();
        List<Remind> remindList= employeeService.getRemindByEmployeeId(employeeId);
        model.addAttribute("remindList",remindList);
//        System.out.println(remindList);
        return "train";
    }

    @RequestMapping("/train/add")
    public String addTrain(TrainTmp train){

        System.out.println(train);
        int i = memberService.addTrain(train);
        if(i != -1)
        {
            System.out.println("success");
        }
//        List<Train> trainList = memberService.getAllTrain();
//        model.addAttribute("trainList",trainList);
        return "train";
    }

    @RequestMapping("/train/{id}")
    @ResponseBody
    public Train getTrainByTrainId(@PathVariable("id") String trainId){
        return memberService.getTrainByTrainId(trainId);
    }

    /**
     * 旅行服务信息，查增删改
     * @param model
     * @return
     */

    @RequestMapping("/travel")
    public String getTravel(Model model)
    {
        List<Travel> travelList = memberService.getAllTravel();
        System.out.println(travelList);
        model.addAttribute("travelList",travelList);
        return "travel";
    }

    @RequestMapping("/travel/{id}")
    @ResponseBody
    public Travel getTravelByTravelId(@PathVariable("id") String travelId){
        return memberService.getTravelByTravelId(travelId);
    }

    @RequestMapping("/travel/add")
    @ResponseBody
    public String addTravel(Travel travel){
        System.out.println(travel);
        int i = memberService.addTravel(travel);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    @RequestMapping("/travel/delete/{id}")
    @ResponseBody
    public String modifyTravel(@PathVariable("id") String travelId){

        int i = memberService.deleteTravel(travelId);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    @RequestMapping("/travel/modify")
    @ResponseBody
    public String modifyTravel(Travel travel){

        System.out.println(travel);
        System.out.println("?????");
        int i = memberService.modifyTravel(travel);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    /**
     * 援救信息管理，查增删改
     * @param model
     * @return
     */

    @RequestMapping("/rescue")
    public String getAllRescue(Model model)
    {
        List<Rescue> rescueList = memberService.getAllRescue();
        List<Car> carList = memberService.getAllCar();
        model.addAttribute("rescueList",rescueList);
        model.addAttribute("carList",carList);
        return "rescue";
    }

    @RequestMapping("/rescue/{id}")
    @ResponseBody
    public Rescue getRescueByRescueId(@PathVariable("id") String rescueId)
    {
        System.out.println("rescueId:"+rescueId);
        Rescue rescueByRescueId = memberService.getRescueByRescueId(rescueId);
        System.out.println(rescueByRescueId);
        return rescueByRescueId;
    }

    @RequestMapping("/rescue/add")
    @ResponseBody
    public String addRescue(Rescue rescue){
        System.out.println(rescue);
        int i = memberService.addRescue(rescue);
        if(i != -1)
        {
            System.out.println("success add rescue");
        }
        return "success";
    }

    @RequestMapping("/rescue/delete/{id}")
    @ResponseBody
    public String deleteRescue(@PathVariable("id") String rescueId){

        int i = memberService.deleteRescue(rescueId);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    @RequestMapping("/rescue/modify")
    @ResponseBody
    public String modifyRescue(Rescue rescue){
//        System.out.println(rescue);
        int i = memberService.modifyRescue(rescue);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    /**
     * 会员信息管理 查增删改
     * @param model
     */
    @RequestMapping("/member")
    public String getAllMember(Model model)
    {
        List<Member> memberList = memberService.getAllMember();
        /*
        测试导出excel功能，成功
        MemberExcel memberExcel = new MemberExcel("D://CarClub//aaa.xls","memberList");
        memberExcel.setColValue(memberList);
        ExcelUtils.makeExcel(memberExcel);
        */
        model.addAttribute("memberList",memberList);
        return "member";
    }
    @RequestMapping("/member/{id}")
    @ResponseBody
    public Member getMemberById(@PathVariable("id") String memberId)
    {
        Member memberById = memberService.getMemberById(memberId);
        System.out.println(memberById);
        return memberById;
    }
    @RequestMapping("/member/add")
    @ResponseBody
    public String addMember(Member member){
        System.out.println(member);
        int i = memberService.addMember(member);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    @RequestMapping("/member/delete/{id}")
    @ResponseBody
    public String modifyMember(@PathVariable("id") String memberId){
        int i = memberService.deleteMember(memberId);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    @RequestMapping("/member/modify")
    @ResponseBody
    public String modifyMember(Member member){
        System.out.println(member);
        int i = memberService.modifyMember(member);
        if(i != -1)
        {
            System.out.println("success");
        }
        return "success";
    }

    /**
     * 救援车辆管理，仅用于更改状态
     * @param carId
     */
    @RequestMapping("/car/change/{id}")
    @ResponseBody
    public String carStatusChange(@PathVariable("id") String carId)
    {
        System.out.println(carId);
        int i = memberService.carStatusChange(carId);
        if(i != -1)
        {
            return "success";
        }
        System.out.println(i);
        return "false";
    }
}
