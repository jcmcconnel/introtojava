import java.lang.Math;
public class MethodDeclaration{
   public static void main(String[] args){
      //create a class instance
      MethodDeclaration md = new MethodDeclaration();

      //call your first method here
      md.talk();

      //call the second method here
      int value = 150;
      int sameValue = md.getInt(value);

      System.out.println(sameValue);


      //call the third method here
      System.out.println(md.sum(1,2,4.5));

      System.out.println(md.randomNumber());
   }
   //create your first method here
   public void talk(){
      System.out.println("Inside of the talk method");
   }

   public int getInt(int input){
      return input;
   }


   public double sum(int x, int y, double z){
      return x+y+z;
   }


   public int randomNumber(){
      //random() gives a double between 0 and 1.
      //To get a number within a desired range,
      //Multiple by the width of the desired range,
      //and add the lowest number in that range.
      //Then cast to the desired type.
      return (int)(Math.random()*49L)+1;
   }

}
