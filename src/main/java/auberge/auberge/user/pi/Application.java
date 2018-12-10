package auberge.auberge.user.pi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer
{
	
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value = "/")
	String home()
	{
		return "home";
	}
}
