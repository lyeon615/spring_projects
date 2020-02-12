package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.area.Circle;

@Controller
public class AreaController {

	private static final Logger logger = LoggerFactory.getLogger(AreaController.class);

	@RequestMapping("/circle")
	public String circleradius() {
		logger.info("circleradius() run");
					
		return "area/index";
	}
	
	@RequestMapping("/area/circleArea")
	public String circleArea(Circle circle) {
		logger.info("circleArea() run");
					
		return "area/circleArea";
	}
}
