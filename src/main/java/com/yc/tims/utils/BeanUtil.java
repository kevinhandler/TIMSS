package com.yc.tims.utils;

import java.lang.reflect.Field;

/**
 * bean 工具
 * @author Administrator
 *
 */
public class BeanUtil {

	/**
	 * 获取set方法名
	 * 获取标名
	 * @param clazz
	 */
	public static String getTableName(Class<?> clazz){
		//获取类名
		String name = clazz.getSimpleName();
		name = name.substring(0, 1).toLowerCase()+name.substring(1);
		return name;
	}

	/**
	 * @param field
	 * @return
	 */
	public static String setter(Field field){
		String name = field.getName();
		return "set"+name.substring(0,1).toUpperCase()+name.substring(1);
	}
	public static String getter(Field field){
		return getter(field.getName());
	}
	public static String getter(String name){
		return "get"+name.substring(0,1).toUpperCase()+name.substring(1);
	}

	public static String getColumnName(Field field){
		String name = field.getName();
		return name.substring(0,1).toLowerCase()+name.substring(1);
	}
}