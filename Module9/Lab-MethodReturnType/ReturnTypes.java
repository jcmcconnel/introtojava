import java.lang.Math;
public class ReturnTypes{
   public static void main(String[] args){
      //create a class instance
      ReturnTypes rt = new ReturnTypes();


      //call your method here
      rt.returnNothing();
      System.out.println(rt.returnBoolean());
      System.out.println(rt.getPi());
      char[] alphabet = rt.getAlphabetArray();
      for(int i=0; i<alphabet.length; i++) System.out.println(alphabet[i]);
   }


   //create your first method here
   public void returnNothing(){
      System.out.println("Inside of a void method");
   }
   //a method that returns a boolean
   public boolean returnBoolean(){
      return true;
   }

   //Exercise 1
   public double getPi(){
      return Math.PI;
   }

   //Exercise 2
   public char[] getAlphabetArray(){
      char[] alphabet = new char[26]; 
      for(int i=0;i<alphabet.length;i++) alphabet[i] = (char)('a'+i);
         
      return alphabet;
   }
}

      
