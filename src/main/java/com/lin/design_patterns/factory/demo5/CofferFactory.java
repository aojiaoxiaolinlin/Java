package com.lin.design_patterns.factory.demo5;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CofferFactory {

    private static final HashMap<String, Coffee> map = new HashMap<>();

    // 加载数据
    static {
        Properties properties = new Properties();
        InputStream is = CofferFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            //获取全类名
            Set<Object> keySet = properties.keySet();
            for (Object key : keySet) {
                String className = (String) properties.get(key);
                // 加载类创建对象
                Class<?> clazz = Class.forName(className);
//                Coffee coffee = (Coffee) clazz.newInstance();
                // 新的实例化方法
                Constructor<?> clazzDeclaredConstructor = clazz.getDeclaredConstructor();
                Coffee coffee = (Coffee) clazzDeclaredConstructor.newInstance();

                map.put((String) key, coffee);
            }
        } catch
        (IOException | ClassNotFoundException | InvocationTargetException | InstantiationException |
         IllegalAccessException | NoSuchMethodException
                        e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param name 根据名称获取对象
     * @return Coffee
     */
    public static Coffee createCoffee(String name) {

        // 加载配置文件中的配置生成对象，并存储。
        return map.get(name);

    }
}
