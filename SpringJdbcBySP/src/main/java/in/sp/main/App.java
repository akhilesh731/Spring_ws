package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.main.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("myJdbcTemplate");
        
        String query = "insert into STUDENT values(?,?,?)";
        int result = jdbcTemplate.update(query,110,"Radha","Agra");
        System.out.println(result);
        ((AnnotationConfigApplicationContext)context).close();
    }
}
