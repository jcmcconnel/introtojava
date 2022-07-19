public class MethodParams{
   public static void main(String[] args){
      //create a class instance
      MethodParams mp = new MethodParams();

      //call your method here
      double d = mp.convertIntToDouble(44);

      //print the value to the console
      System.out.println(d);


      //call the 2nd method here
      System.out.println(mp.sum(1.0,2,3));

      float[] val = mp.square(1,2,3,4);
      for(int i=0; i<val.length; i++) System.out.println(val[i]);
      System.out.println("For walrus and peanut: "+mp.findFirstWord("walrus", "peanut")+" comes first");
   }


   //create your first method here
   public double convertIntToDouble(int num){
      return (double)num;
   }

   //new sum method here
   public double sum(double num1, int num2, int num3){
      return num1+num2+num3;
   }


   //Exercise One
   public float[] square(int a, int b, int c, int d){
      float[] value = new float[4];
      value[0] = a*a;
      value[1] = b*b;
      value[2] = c*c;
      value[3] = d*d;
      return value;
   }

   //Exercise two
   public String findFirstWord(String a, String b){
      for(int i=0; i<a.length(); i++){
         if(a.charAt(i) > b.charAt(i)) return b; //a is farther along the alphabet
      }
      return a;
   }
}

