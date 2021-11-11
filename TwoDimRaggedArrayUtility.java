import java.io.*;
import java.util.Scanner;

class TwoDimRaggedArrayUtility{   
   public static double getTotal(double[][] data)
   {
       double total = 0;       
       for(int row = 0;row < data.length;row++)
       {
           for(int col = 0;col < data[row].length;col++)
           {
               total += data[row][col];
           }
       }
       return total;
   }
   
   public static double getAverage(double[][] data)
   {
       double average = 0;
       double total = 0;
       int numVals = 0;  
       for(int row = 0;row <data.length;row++)
       {
           for(int col = 0;col < data[row].length;col++)
           {
               total += data[row][col];
               numVals += 1;
           }
       }
       average = (total/numVals);
       
       return average;
   }
   
   public static double getRowTotal(double[][] data,int row)
   {
       double total = 0;
       for(int i = 0;i < data[row].length;i++)
       {
           total += data[row][i];
       }
       return total;
   }
   
   public static double getColumnTotal(double[][] data,int col)
   {
       double total = 0;     
       for(int i = 0;i < data.length;i++)
       {
           if(col <= data[i].length - 1)
           {
               total += data[i][col];
           }
       }
       return total;
   }
   
   public static double getHighestInRow(double[][] data,int row)
   {
       double high = data[row][0];
       for(int i = 0;i < data[row].length;i++)
       {
           if(data[row][i] > high)
           {
               high = data[row][i];
           }

       }
       return high;
   }
   
   public static double getLowestInRow(double[][] data,int row)
   {
        double low = data[row][0];
        for(int i = 0;i < data[row].length;i++)
        {
            if(data[row][i] < low)
            {
                low = data[row][i];
            }

        }
        return low;
    }
   
   public static int getHighestInRowIndex(double[][] data,int row)
   {
	   int highIndex = 0;
	   double high = data[row][0];
       for(int i = 0;i < data[row].length;i++)
       {
	       if(data[row][i] > high)
	       {
	            high = data[row][i];
	            highIndex = i;
	       }
       }
       return highIndex;
   }
   
   public static int getLowestInRowIndex(double[][] data,int row)
   {
	   int lowIndex = 0;
	   double low = data[row][0];
       for(int i =0;i < data[row].length;i++)
       {
           if(data[row][i] < low)
           {
               low = data[row][i];
               lowIndex = i;
           }

       }
       return lowIndex;
   }
   
   public static double getHighestInColumn(double[][] data,int col)
   {
       double high = data[0][col];
       for(int i = 0;i < data.length;i++)
       {
           if(col <= data[i].length - 1)
           {               
               if(data[i][col] > high)
               {
                   high = data[i][col];
               }
           }
       }
       return high;     
   }
   
   public static double getLowestInColumn(double[][] data,int col)
   {
       double low = data[0][col];
       for(int i = 0;i < data.length;i++)
       {
           if(col <= data[i].length - 1)
           {
               if(data[i][col] < low)
               {
                   low = data[i][col];
               }
           }
       }       
       return low;  
   }
   
   public static int getHighestInColumnIndex(double[][] data, int col)
   {
	   int highIndex = 0;
	   double high = data[0][col];
       for(int i = 0;i < data.length;i++)
       {
           if(col < data[i].length)
           {               
               if(data[i][col] > high)
               {
                   high = data[i][col];
                   highIndex = i;
               }
           }
    	   
       }
       return highIndex;     
   }
   
   public static int getLowestInColumnIndex(double[][] data,int col)
   {
	   int lowIndex = 0;
	   double low = data[0][col];
       for(int i = 0;i < data.length;i++)
       {
	   	   if(col < data[i].length)
	   	   {
	            if(data[i][col] < low)
	            {
	               low = data[i][col];
	                lowIndex = i;
	            }
	        }
       }
       return lowIndex;    
   	}
   
  public static double getHighestInArray(double[][] data)
  {
       double high = data[0][0];
       for(int row = 1; row < data.length;row++)
       {
           for(int col = 0;col < data[row].length;col++)
           {
               if(data[row][col] > high)
               {
                   high = data[row][col];
               }
           }
       }
       return high;
  }        
    
   public static double getLowestInArray(double[][] data)
   {
       double low = data[0][0];
       for(int row = 1;row < data.length;row++)
       {
           for(int col = 0;col < data[row].length;col++)
           {
               if(data[row][col] < low)
               {
                   low = data[row][col];
               }
           }
       }
       return low;
   }
   
   public static double[][] readFile(java.io.File outputFile) throws java.io.FileNotFoundException
   {
	   double[][] data = new double[6][6];
	   String list;
       int row = 0;

       try
       {
    	   Scanner scan = new Scanner(outputFile);
           while ((list = scan.nextLine()) != null)
           {
                String[] tempArr = list.split(" ");
                int size = tempArr.length; 
                data[row] = new double[size];
                
                for (int col = 0; col < size; col++)
                {
                     data[row][col] += Double.parseDouble(tempArr[col]);
                }
           row++;
           }
           scan.close();
       }
       catch (Exception ex)
       {
           ex.printStackTrace();
       }
       return data;
  }
  
   public static void writeToFile(double[][] data, java.io.File outputFile) throws java.io.FileNotFoundException
   {
	   try
	   {
		   PrintWriter writeToFile = new PrintWriter(outputFile);
		   for (int row = 0; row < data.length; row++)
		   {
				for (int col = 0; col < data[row].length; col++)
				{
					writeToFile.print(data[row][col] + " ");
				}
				writeToFile.println();
			}
			writeToFile.close();
       }
       catch(FileNotFoundException ex)
	   {
           ex.printStackTrace();
       }
   }
}