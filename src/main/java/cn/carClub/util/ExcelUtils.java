package cn.carClub.util;

import cn.carClub.dto.excelData.ExcelData;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.util.List;

/**
 * Created by Kuexun on 2018/6/24.
 */
public class ExcelUtils {
    public static boolean makeExcel(ExcelData data){
        try{
            File file = new File(data.getFilePathname());
            WritableWorkbook wwb = Workbook.createWorkbook(file);
            WritableSheet ws = wwb.createSheet(data.getSheetName(), 0);
            //先做表头
            int r = 0;
            int c1 = 0;
            for(String s:data.getColName()){
                ws.addCell(new Label(c1++,r,s));
            }
            for(String[] ss:data.getColValue()){
                r++;
                int c2=0;
                for(String s:ss){
                    ws.addCell(new Label(c2++,r,s));
                }
            }
            wwb.write();
            wwb.close();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
