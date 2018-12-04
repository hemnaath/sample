public class sorting {
	public static void main(String[] args) 
    {
        int[] my_array = {1,3,2,2,3,4,3};
 
        for (int i = 0; i < my_array.length; i++)
        {
            for (int j = i; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j) )
                { 
            	   System.out.println("Duplicate Element : "+my_array[j]);
               }
                }
            }
        }
    }
