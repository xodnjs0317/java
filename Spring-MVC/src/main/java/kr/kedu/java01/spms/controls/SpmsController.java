package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public interface SpmsController {
	String execute(Map<String, Object> model) throws Exception;

}
