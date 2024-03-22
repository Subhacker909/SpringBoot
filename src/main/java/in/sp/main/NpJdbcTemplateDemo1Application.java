package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.dao.InsertOperation;

@SpringBootApplication
public class NpJdbcTemplateDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(NpJdbcTemplateDemo1Application.class, args);
	InsertOperation  io=context.getBean(InsertOperation.class);
	io.insertData();
	
	
	}

}
