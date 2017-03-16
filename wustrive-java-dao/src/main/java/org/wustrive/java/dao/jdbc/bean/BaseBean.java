package org.wustrive.java.dao.jdbc.bean;

import java.io.Serializable;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.wustrive.java.dao.jdbc.dao.BaseDao;
import org.wustrive.java.dao.jdbc.dao.SpringContextHolder;

public interface BaseBean extends Serializable{
	
	public BaseDao dao = SpringContextHolder.getBean(BaseDao.class);
	
	public  String getId();
	
	public  <T> T setId(String id);
	
	public  String getTableName();
	
	public  String getUpdateSql();
	
	public  String getInsertSql();
	
	
	public  <T> T insert();
	
	public  <T> T update();
	
	public  <T> T queryForBean();
	
	public  Map<String, Object> getBeanValues();
	
	
	public  <T> T getInstanceById();
	
	/**
	 * 通过ID获取该条信息的Map
	 * @return
	 */
	public  Map<String, Object> getBeanMapById();
	
	
	public  void deleteById();
	
	public  <T> T insertOrUpdate();
	
	public  BaseBean newInstance();
	
	public String getParameter();
	
	@SuppressWarnings("rawtypes")
	public abstract RowMapper newMapper();
	
}
