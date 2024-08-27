package com.wipro.JdbcTemplate.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class AddressResultSetExtractor implements ResultSetExtractor<Map<String,List<String>>>{

	public Map<String, List<String>> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		Map<String,List<String>> result=new HashMap<String, List<String>>();
		
		while(rs.next()) {
			String name=rs.getString("student_name");
			String address=rs.getString("student_address");
			List<String> names=result.get(address);
			if(names==null) {
				List<String> newnames=new ArrayList<String>();
				newnames.add(name);
				result.put(address,newnames);
			}
			else {
				names.add(name);
			}
		}
		return result;
	}

}
