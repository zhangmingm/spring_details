package com.store.platform.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Package com.store.platform.annotation
 * @ClassName: com.store.platform.annotation.ReturnQuery  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月17日 下午5:54:55
 * @Description:
 */
public class ReturnQuery {
	
//	public static String query(Object object){
//		StringBuilder sb=new StringBuilder();
//		// 1 获取到Class
//		Class<?> c=object.getClass();
//		if(!c.isAnnotationPresent(Table.class)){
//			return null;
//		}
//		//2 获取Table的名字
//		Table t=(Table)c.getAnnotation(Table.class);
//		String tableName=t.value();
//		// where 1=1
//		sb.append("select * from ").append(tableName).append(" where 1=1 ");
//		// 获取类属性的所有字段
//		Field[] fArray=c.getDeclaredFields();
//		//3 遍历所有的字段
//		for(Field field:fArray){
//			//4 处理每个字段对应的sql
//			// 判断是否包含column类型的注解
//			if(!field.isAnnotationPresent(Column.class)){
//				continue;
//			}
//			//4.1 拿到字段上注解的值，即Column注解的值。
//			Column column=field.getAnnotation(Column.class);
//			String columnName=column.value();
//			//4.2 拿到字段的名
//			String fieldName=field.getName();
//			String getMethodName="get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
//			//字段的值
//			//属性有
//			Object fieldValue=null;
//			try {
//				Method methodName=c.getMethod(getMethodName);
//			} catch (NoSuchMethodException | SecurityException e) {
//				e.printStackTrace();
//			}
//			//4.3 拼接sql
//			if(fieldValue==null
//			   ||(fieldValue instanceof Integer && (Integer)fieldValue==0)){
//				continue;
//			}
//			sb.append(" and ").append(fieldName);
//			if(fieldValue instanceof String){
//				if(((String)fieldValue).contains(",")){
//					String [] values=((String)fieldValue).split(",");
//					sb.append(" in (");
//					for(String v: values){
//						sb.append("'").append(v).append("'").append(",");
//					}
//					sb.deleteCharAt(sb.length()-1);
//					sb.append(")");
//				}else{
//					sb.append("=").append("'").append(fieldValue).append("'");
//				}
//			}else if(fieldValue instanceof Integer){
//				sb.append("=").append(fieldValue);
//			}
//		}
//		return sb.toString();
//		
//	}

	
	public static String query(Object u){
		StringBuilder sqlStrBuilder = new StringBuilder();
		//1.获取到Class
		Class c = u.getClass();
		//判断是否包含Table类型的注解
		if(!c.isAnnotationPresent(Table.class)){
			return null;
		}
		//2.获取到table的名字
		Table t = (Table) c.getAnnotation(Table.class);
		String tableName = t.value();
		//加入 where 1=1 ，是为了防止未来如果没有条件的情况下也不会报错
		sqlStrBuilder.append("select * from ").append(tableName).append(" where 1=1");
		
		Field[] fArray = c.getDeclaredFields();   //获取类属性的所有字段，
		//3.遍历所有的字段
		for (Field field : fArray) { 
			//4.处理每个字段对应的sql
			//判断是否包含Column类型的注解
			if(!field.isAnnotationPresent(Column.class)){
				continue;
			}
			//4.1.拿到字段上面注解的值，即Column注解的值
			Column column = field.getAnnotation(Column.class);
			String columnName = column.value();  
			//4.2.拿到字段的名
			String filedName = field.getName();
			//获取相应字段的getXXX()方法
			String getMethodName = "get" + filedName.substring(0, 1).toUpperCase()
					+ filedName.substring(1);
			//字段的值
			Object fieldValue = null;//属性有int、String等，所以定义为Object类
			try {
				Method getMethod = c.getMethod(getMethodName);
				fieldValue = getMethod.invoke(u);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			//4.3.拼接sql
			if(fieldValue==null || (fieldValue instanceof Integer && (Integer)fieldValue==0)){
				continue;
			}
			sqlStrBuilder.append(" and ").append(filedName);
			if(fieldValue instanceof String){
				if(((String)fieldValue).contains(",")){
					String[] values = ((String)fieldValue).split(",");
					sqlStrBuilder.append(" in(");
					for (String v : values) {
						sqlStrBuilder.append("'").append(v).append("'").append(",");
					}
					sqlStrBuilder.deleteCharAt(sqlStrBuilder.length()-1);
					sqlStrBuilder.append(")");
				}
				else{
					sqlStrBuilder.append("=").append("'").append(fieldValue).append("'");
				}
			}
			else if(fieldValue instanceof Integer){
				sqlStrBuilder.append("=").append(fieldValue);
			}
		}
		return sqlStrBuilder.toString();
		
	}
}
