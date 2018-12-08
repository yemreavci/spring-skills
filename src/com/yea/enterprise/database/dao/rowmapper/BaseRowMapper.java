package com.yea.enterprise.database.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public abstract class BaseRowMapper<T> implements RowMapper<T> {
	public String getString(ResultSet rs, String columnName,String def){
		try {
			return rs.getString(columnName);
		} catch (SQLException e) {
			e.printStackTrace();
			return  def;
		}
	}
	public Long getLong(ResultSet rs, String columnName,Long def){
		try {
			if(rs.getObject(columnName)==null) {
				return def;
			}
			return Long.valueOf(rs.getLong(columnName));
		} catch (SQLException e) {
			e.printStackTrace();
			return  def;
		}
	}
	public Integer getInteger(ResultSet rs, String columnName,Integer def){
		try {
			if(rs.getObject(columnName)==null) {
				return def;
			}
			return Integer.valueOf(rs.getInt(columnName));
		} catch (SQLException e) {
			e.printStackTrace();
			return  def;
		}
	}
	public Boolean getBoolean(ResultSet rs, String columnName,Boolean def){
		try {
			if(rs.getObject(columnName)==null) {
				return def;
			}
			return Boolean.valueOf(rs.getBoolean(columnName));
		} catch (SQLException e) {
			e.printStackTrace();
			return  def;
		}
	}	
		
}
