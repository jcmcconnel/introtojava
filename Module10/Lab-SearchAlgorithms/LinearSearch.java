public class LinearSearch{
   public static void main(String[] args){
      char letter = 'm';
      //create some dummy data for our method
      char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

      //call your methods here
      LinearSearch ls = new LinearSearch();
      System.out.println(ls.findIndex(letter, letters));
      System.out.println(ls.findLetterBackwards(letter, letters));
      System.out.println(ls.findLetterFromMiddle(letter, letters));
   }
   
   //create your first method here
   //The activity started with this name --> public int findLetter(char target, char[] data){
   public int findIndex(char target, char[] data){
      if(data == null) return -1;
      int result = -1;
      //loop through the data
      for(int i=0; i<data.length; i++){
         char temp = data[i];
         //test current element against target
         if(temp == target) return i; //return the current index
      
      }
      return result;
   }


   //Exercise one
   public int findLetterBackwards(char target, char[] data){
      if(data == null) return -1;
      int result = -1;
      //loop through the data
      for(int i=data.length-1; i>=0; i--){
         char temp = data[i];
         //test current element against target
         if(temp == target) return i; //return the current index
      
      }
      return result;
   }

   //Exercise two
   public int findLetterFromMiddle(char target, char[] data){
      if(data == null) return -1;
      int result = -1;
      int extraPoint = 0;
      if(data.length%2 != 0) extraPoint=1;
      
      char[] left = new char[data.length/2];
      char[] right = new char[data.length/2+extraPoint];
      for(int i=0; i<data.length/2; i++){
         right[right.length-1-i] = data[data.length-1-i];
         left[i] = data[i];
      }
      if(extraPoint == 1) right[0] = data[data.length/2+1];
      int leftVal = findIndex(target, left);
      if(leftVal == -1){
         return findLetterBackwards(target, right)+data.length/2;
      } else return leftVal;
   }
}

