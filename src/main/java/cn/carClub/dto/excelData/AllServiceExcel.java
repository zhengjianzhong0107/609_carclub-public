package cn.carClub.dto.excelData;

import cn.carClub.dto.AllService;
import cn.carClub.pojo.Member;

import java.util.List;

/**
 * Created by Kuexun on 2018/6/27.
 */
public class AllServiceExcel extends ExcelData{
    public AllServiceExcel(String filePathname, String sheetName) {
        super(filePathname, sheetName);
    }
    public void setColValue(List<AllService> services)
    {
        colNum = 5;
        rowNum = services.size();
        colName = new String[colNum];
        colValue = new String[rowNum][colNum];

        String[] cName = {"会员编号","姓名","服务名称","服务时间","服务内容"};
        this.setColName(cName);
        int r = 0;
        for(AllService m: services)
        {
            String[] row = new String[colNum];
            row[0] = m.getMemberId();
            row[1] = m.getMemberName();
            row[2] = m.getServiceName();
            row[3] = m.getServiceTime();
            row[4] = m.getServiceMessage();
            colValue[r++] = row;
        }
    }
}
