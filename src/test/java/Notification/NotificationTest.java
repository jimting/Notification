package Notification;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotificationTest {

	@Autowired
	private NotificationController notification;
	
	//test controller
	
	@Test
	public void testIndex()
	{
		assertEquals("success", notification.index());
	}

	@Test
	public void testGetNotification() 
	{
		assertTrue(isJSONValid(notification.getNotification("1")));
	}
	
	@Test
	public void testNewNotification()
	{
		assertEquals("success", notification.newNotification("1", "JUnit Test"));
	}
	
	@Test
	public void testSetRead()
	{
		assertEquals("success", notification.setNotificationRead("123"));
	}
	
	@Test
	public void testDeleteNotification() 
	{
		assertEquals("success", notification.deleteNotification("1"));
	}
	
	
	
	public boolean isJSONValid(String test) {
	    try {
	        new JSONObject(test);
	    } catch (JSONException ex) {
	        // edited, to include @Arthur's comment
	        // e.g. in case JSONArray is valid as well...
	        try {
	            new JSONArray(test);
	        } catch (JSONException ex1) {
	            return false;
	        }
	    }
	    return true;
	}
}
