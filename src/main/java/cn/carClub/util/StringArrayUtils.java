package cn.carClub.util;

import org.apache.ibatis.type.JdbcType;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Kuexun on 2018/6/26.
 */
public class StringArrayUtils {
    public static String[] getStringArray(String columnValue) {
        if (columnValue == null)
            return null;
        return columnValue.split("-");
    }
    public static String getString(String[] parameter){
        //由于BaseTypeHandler中已经把parameter为null的情况做了处理，所以这里我们就不用再判断parameter是否为空了，直接用就可以了
        String result ="";
        for (String value : parameter)
        {
            result+=value+"-";
            System.out.println(value);
        }
        System.out.println(result);
        return (result.substring(0,result.length()-2));
    }
}
