package co.brushbooks.brushbooks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrushBooksController {
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

}
