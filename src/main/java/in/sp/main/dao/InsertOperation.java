package in.sp.main.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertOperation {
	@Autowired
	private NamedParameterJdbcTemplate npJdbctemplate;
	
	public void insertData() {
		
		Map<String,Object> map=new HashMap<>();
		map.put("key_clientid", "105");
		map.put("key_clientname", "aakash");
		map.put("key_clientcity", "ballia");

		String sql_query="insert into client values(:key_clientid,:key_clientname,:key_clientcity)";
		int count=npJdbctemplate.update(sql_query, map);
		if(count>0) {
			System.out.println("success");
		}else {
			System.out.println("fail");

		}
	}

}
