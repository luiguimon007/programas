package JUnit;

import static org.junit.Assert.assertEquals;

import java.util.StringTokenizer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
    public static int cube(int n){  
        return n*n*n;  
    }  
    //method that returns reverse words   
    public static String reverseWord(String str){  
  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Test2.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ana ",Test2.reverseWord("ana"));  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

}
