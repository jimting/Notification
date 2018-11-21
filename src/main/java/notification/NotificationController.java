package notification;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class NotificationController 
{
    
    @RequestMapping(value = "getNotification", method = RequestMethod.GET)
    public String getGrocery(@RequestParam("userID") String userID)
    {
    	return Notification.getNotification(userID);
    }
  
}
