public class StringMethods{
   
   public static void main(String[] args){
      String str = "Hello";
      String s = new String("Hello");

      System.out.println(str.equals(s));


      //use the length() method
      System.out.println(str.length());
      
      //use the indexof() method
      System.out.println(str.indexOf('H'));

      //Makes string uppercase
      System.out.println(str.toUpperCase());

      //Makes string lower case
      System.out.println(str.toLowerCase());
      
      //Makes string returns the character at index 3
      System.out.println(str.charAt(3));

      //Makes string case insensitive equals
      System.out.println(str.equalsIgnoreCase(s));

      //Returns everything after the given index
      System.out.println(str.substring(2));
   }
}

