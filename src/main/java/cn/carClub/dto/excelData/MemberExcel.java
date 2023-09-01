package cn.carClub.dto.excelData;

import cn.carClub.pojo.Member;

import java.util.List;

/**
 * Created by Kuexun on 2018/6/24.
 */
public class MemberExcel extends ExcelData {
    public MemberExcel(String filePathname, String sheetName) {
        super(filePathname, sheetName);
    }
    public void setColValue(List<Member> memberList)
    {
        colNum = 6;
        rowNum = memberList.size();
        colName = new String[colNum];
        colValue = new String[rowNum][colNum];

        String[] cName = {"编号","姓名","身份证号","电话号码","电子邮箱"};
        this.setColName(cName);
        int r = 0;
        for(Member m:memberList)
        {
            String[] row = new String[colNum];
            row[0] = m.getMemberId();
            row[1] = m.getMemberName();
            row[3] = m.getMemberCard();
            row[4] = m.getMemberPhone();
            row[5] = m.getMemberEmail();
            colValue[r++] = row;
        }
    }

}
