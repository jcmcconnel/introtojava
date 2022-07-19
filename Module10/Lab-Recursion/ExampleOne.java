public class ExampleOne{
   public static void main(String[] args){
      //create some dummy data for our method
      int input = 5;
      int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
      ExampleOne eo = new ExampleOne();


      //call your methods here
      System.out.println(eo.factorial(input));
      eo.printAllLast('m');
      System.out.println(eo.binSearch(input, intArray, 0, intArray.length-1));
   }


   //create your first method here
   public int factorial(int num){
      if(num == 0 || num == 1) return 1;
      return num*factorial(num-1);
   }


   //Exercise one
   public char printAllLast(char c){
      System.out.println(c);
      if(c == 'a') {
         return c;
      } else {
         return printAllLast((char)(c-1));
      }
   }

   //Exercise two
   public int binSearch(int target, int[] data, int bottom, int top){
      if(data == null) return -1;
      if(bottom == top){
         if(data[bottom] == target) return bottom;
         else return -1;
      }

      int left = binSearch(target, data, bottom, bottom+(top-bottom)/2);
      if(left > -1) return left;

      int extrapoint = 0;
      if((top-bottom)%2 != 0) extrapoint = 1;
      int right = binSearch(target, data, bottom+(top-bottom)/2+extrapoint+1, top);
      return right;
   }
}

