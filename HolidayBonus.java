
public class HolidayBonus{
	
	public HolidayBonus() {
	}

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other)
	{
	    double[] arr = new double[data.length];
	    for (int row = 0; row < data.length; row++)
	    {
	        for (int col = 0; col < data[row].length; col++)
	        {
		        if(data[row][col] > 0)
		        {
	               if(data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col))
	               {
	                  arr[row] += high;
	               }
	               else if(data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col))
	               {
	                   arr[row] += low;
	               }
	               else 
	               {
	            	   	arr[row] += other;
	               }
	             }
	         }
	    }
	    return arr;
	 }
      
    public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
    {
    	double[] list = calculateHolidayBonus(data, high, low, other);
		double totalBonus = 0;
		for (int i = 0; i < data.length; i++) 
		{
			totalBonus += list[i];
		}
		return totalBonus;
    }
}