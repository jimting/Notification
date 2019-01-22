package Notification;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class NotificationController {
	@CrossOrigin(origins = "*")
	@RequestMapping("/")
    public String index() 
    {
		return "success";
    }
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "getNotification", method = RequestMethod.GET)
    public String getNotification(@RequestParam("userID") String userID)
    {
    	return Notification.getNotification(userID);
    }
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "newNotification", method = RequestMethod.GET)
    public String newNotification(@RequestParam("userID") String userID, @RequestParam("content") String content)
    {
    	Notification.newNotification(userID, content);
    	return "新增成功";
    }
	
}



