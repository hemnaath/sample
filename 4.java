public class nonrepeat {
	 static int firstNonRepeating(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) { 
	            int j; 
	            for (j = 0; j < n; j++) 
	                if (i != j && arr[i] == arr[j]) 
	                    break; 
	            if (j == n) 
	                return arr[i]; 
	        } 
	          
	        return -1; 
	    } 
	     
	    public static void main (String[] args) 
	    {  
	        int arr[] = { 1, 2, 1, 3, 2 }; 
	        int n = arr.length; 
	          
	        System.out.print(firstNonRepeating(arr, n)); 
	    } 
}