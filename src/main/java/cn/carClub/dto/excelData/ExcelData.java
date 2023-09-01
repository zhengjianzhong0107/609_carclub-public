package cn.carClub.dto.excelData;

import cn.carClub.pojo.Member;

import java.util.List;

/**
 * Created by Kuexun on 2018/6/24.
 */
public abstract class ExcelData {
    private String filePathname;
    private String sheetName;
    protected int rowNum;
    protected int colNum;
    protected String[] colName;
    protected String[][] colValue;

    public ExcelData(String filePathname, String sheetName) {
        this.filePathname = filePathname;
        this.sheetName = sheetName;
    }

    public String[] getColName() {
        return colName;
    }

    public void setColName(String[] colName) {
        this.colName = colName;
    }

    public String getFilePathname() {
        return filePathname;
    }

    public void setFilePathname(String filePathname) {
        this.filePathname = filePathname;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public void setColNum(int colNum) {
        this.colNum = colNum;
    }

    public int getColNum() {
        return colNum;
    }

    public String[][] getColValue() {
        return colValue;
    }

    public void setColValue(String[][] colValue) {
        this.colValue = colValue;
    }
}
