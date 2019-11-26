package Notification;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class NotificationTest {
	private NotificationController notification = new NotificationController();
	
	//test controller
	
	@Test
	public void testIndex()
	{
		assertEquals("success", notification.index());
	}

	@Test
	public void testGetNotification() 
	{
		String userID = "1";
		assertTrue(isJSONValid(notification.getNotification(userID)));
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
