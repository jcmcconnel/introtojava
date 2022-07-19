import java.util.Scanner;
public class ExampleOne{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please type in a line and hit Enter.");
      String line = scanner.nextLine();
      System.out.println("You have typed: " + line);

//      scanner.close();


      String numbers = "1 2 3 5 7 9";
      Scanner numScanner = new Scanner(numbers);
      while(numScanner.hasNextInt()){
         System.out.print(numScanner.nextInt());
      }
      numScanner.close();

      ExampleOne eo = new ExampleOne();
      eo.userVowels(scanner);
      eo.getDirection(scanner);
      scanner.close();
   }



   //Exercise One
   public void userVowels(Scanner scanner){
      System.out.println("\nGive me some vowels to count");
      String line = new String();
      while(true){
         if(scanner.hasNextLine()) line = scanner.nextLine();
         else continue;
         if(line.equalsIgnoreCase("quit")) break;
         int vowelCount = 0;
         for(int i=0; i<line.length(); i++) 
            switch(line.charAt(i)){
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
                  vowelCount++;
            }
         System.out.println("Vowels in last line: "+vowelCount);
      }
   }

   //Exercise Two
   public void getDirection(Scanner scanner){
      while(true){
         if(!scanner.hasNextInt()) {
            if(scanner.hasNext() && scanner.next().equals("q")) return;
            continue;
         }
         switch(scanner.nextInt()){
            case 1:
               System.out.println("Moving Right");
               break;
            case 2:
               System.out.println("Moving Left");
               break;
            case 3:
               System.out.println("Moving Up");
               break;
            case 4:
               System.out.println("Moving Down");
               break;
            default:
               System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - Exit Program]");
         }
      }
   }
}
