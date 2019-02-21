package Notification;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class NotificationTest {
	private NotificationController notififation = new NotificationController();
	
	@Test
	//測試是否成功連線到DB
	public void testDatabase()
	{
		//if(GroceryInventory.getGrocery(userID))System.out.println("答對了！");
		//else	System.out.println("正確答案應該是5");
	}
	
	@Test
	//controller功能測試
	public void testIndex()
	{
		assertEquals("success", notififation.index());
	}

}
