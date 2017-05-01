public class LambdaPractice{

   //public interface A{
     // public void print(String i, String j, int k);
   //}
   
   public static void main(String[] args){
      A obj = new A(){
         public void print(String i, String j, int k){
            System.out.println("Hello, " + i + j + k);
         }
      };
   
      /*A obj;
         obj = 
         (i, j, k) -> {
            System.out.println("Hello,");
            System.out.print(i + " ");
            System.out.println(j + ",");
            System.out.println(k);
         };*/
         
      obj.print("Clark", "Lindsay", 2017);
   } 

   /*interface IntegerMath {
      int operation(int a, int b);   
   }
 
   public int operateBinary(int a, int b, IntegerMath op) {
      return op.operation(a, b);
   }

   public static void main(String... args) {
   
      LambdaPractice myApp = new LambdaPractice();
      IntegerMath addition = (a, b) -> a + b;
      IntegerMath subtraction = (a, b) -> a - b;
      System.out.println("40 + 2 = " +
         myApp.operateBinary(40, 2, addition));
      System.out.println("20 - 10 = " +
         myApp.operateBinary(20, 10, subtraction));    
   }*/
}