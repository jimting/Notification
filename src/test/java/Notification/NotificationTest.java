package Notification;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class NotificationTest {
	private NotificationController notification = new NotificationController();
	
	//test controller
	
	@Test
	//index
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
