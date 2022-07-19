public class ReverseOrder{
   public static void main(String[] args){
      String[] cities = {"Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia", "Seattle"};

      /*reverse the order of the array below*/
      String temp = cities[cities.length-1];
      for(int i=0; i<cities.length/2; i++){
         cities[cities.length-1-i] = cities[i];
         cities[i] = temp;
         temp = cities[cities.length-2-i];
      }

      //print the result
      for(int i=0; i<cities.length; i++) System.out.println(cities[i]);
   }
}
