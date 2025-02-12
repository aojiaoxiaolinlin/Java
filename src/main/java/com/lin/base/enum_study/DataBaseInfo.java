package com.lin.base.enum_study;

import java.util.EnumMap;

/**
 * Copyright(C),2023年-02月-15,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/15 18:30
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/15      版本号
 */
public class DataBaseInfo {
    private final EnumMap<DataBaseType, String> enumMap = new EnumMap<>(DataBaseType.class);
    //EnumMap 对象 urls 往往是由外部负责整个应用初始化的代码来填充的。
    // 这里为了演示方便，类自己做了内容填充。
    public DataBaseInfo(){
        enumMap.put(DataBaseType.MYSQL,"mysqlURL");
        enumMap.put(DataBaseType.ORACLE,"oracleURL");
        enumMap.put(DataBaseType.SQLSERVER,"sqlserverURL");
    }
    public DataBaseInfo(String mysqlURL,String oracleURL,String sqlserverURL){
        enumMap.put(DataBaseType.MYSQL,mysqlURL);
        enumMap.put(DataBaseType.ORACLE,oracleURL);
        enumMap.put(DataBaseType.SQLSERVER,sqlserverURL);
    }

    public String getURL(DataBaseType type){
        return enumMap.get(type);
    }
}
