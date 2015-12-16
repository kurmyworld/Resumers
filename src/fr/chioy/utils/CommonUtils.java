package fr.chioy.utils;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
public class CommonUtils {
	public static <T> T toBean(Map<?, ?> map,Class<T> clazz){
		try {
			/*
			 * 1.创建制定类型的bean对象
			 */
			T bean = clazz.newInstance();
			/*
			 * 2.把数据封装到javabean中
			 */
			BeanUtils.populate(bean, map);
			/*
			 * 3.返回javabean对象
			 */
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
}
