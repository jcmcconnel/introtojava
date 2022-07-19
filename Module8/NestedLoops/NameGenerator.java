public class NameGenerator{
   public static void main(String[] args){
      String[] arr1 = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
      String[] arr2 = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"}; 

      //iterate over the first set 
      for(int i=0; i<arr1.length; i++){
         //iterate over the second
         for(int j=0; j<arr2.length; j++){
            //print the combo of the current elements from each set
            System.out.println(arr1[i] + " "+ arr2[j]);
         }
      }
   }
}

