 
 package mytest;

 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

 public class AppTest {

     @Test
     public void testApp() {
     Test1 t=new Test1();
         String expected = "mgm";
         String actual =t.palindrome(expected);

         Assertions.assertEquals(expected, actual);
     }
     
     @Test
     public void testApp1() {
     Test1 t=new Test1();
         String expected = "jnec";
         String actual =t.palindrome(expected);

         Assertions.assertEquals(expected, actual);
     }
     
     
 }