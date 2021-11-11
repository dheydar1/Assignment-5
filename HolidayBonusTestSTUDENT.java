import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestSTUDENT 
{
	private double[][] dataSetSTUDENT = {{6.1,3.6,9.4,5.9},{6.9},{9.2,2.8,4.4},{12.7,7.9,8.4,3.8}};

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

		@Test 
		public void testCalculateHolidayBonusA() 
		{
			try
			{
				double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT,5000,1000,2000);
				assertEquals(13000.0,result[0],.001);
				assertEquals(2000.0,result[1],.001);
				assertEquals(4000.0,result[2],.001);
				assertEquals(13000.0,result[3],.001);
			}
			catch (Exception e) 
			{
				fail("This should not have caused an Exception");
			} 
		}

		@Test
		public void testCalculateHolidayBonusB() 
		{
			try
			{
				double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT,1000,250,500);
				assertEquals(2750.0,result[0],.001);
				assertEquals(500.0,result[1],.001);
				assertEquals(1000.0,result[2],.001);
				assertEquals(2750.0,result[3],.001);
			}
			catch (Exception e) 
			{
				fail("This should not have caused an Exception");
			} 
			
		}

	@Test
	public void testCalculateTotalHolidayBonusA() 
	{
		assertEquals(32000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT, 5000, 1000, 2000),.001);
	}
	
	@Test
	public void testCalculateTotalHolidayBonusB() 
	{
		assertEquals(7000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT, 1000,250,500),.001);
	}

}