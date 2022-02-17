package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1{
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    @Test  
    public void testFindMax(){  
        assertEquals(4,Test1.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Test1.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}