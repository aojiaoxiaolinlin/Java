package com.lin.base.enum_study;

/**
 * Copyright(C),2023年-02月-15,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/15 18:19
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/15      版本号
 */
public class TestWeekDay {
    public static void main(String[] args) {
        for(WeekDay day : WeekDay.values()) {
            System.out.println(day+"====>" + day.getDay());
        }
        WeekDay.printDay(5);

        DataBaseInfo dataBaseInfo = new DataBaseInfo();
        String url = dataBaseInfo.getURL(DataBaseType.MYSQL);
        System.out.println("url:"+url);
        DataBaseInfo baseInfo = new DataBaseInfo("mysql1", "oracle1", "sqlserver1");
        System.out.println("new URL:"+baseInfo.getURL(DataBaseType.MYSQL));



    }
}
