public class WeatherMachine{
   int[] pastTemps;
   Thermometer thermometer;

   String city;

   public WeatherMachine(){
      pastTemps = new int[24];
      thermometer = new Thermometer();

      city = "New York City";

      for(int i=0; i<pastTemps.length; i++){
         pastTemps[i] = thermometer.getTemperature();
      }
   }

   public WeatherMachine(String city){
      pastTemps = new int[24];
      thermometer = new Thermometer();

      this.city = city;

      for(int i=0; i<pastTemps.length; i++){
         pastTemps[i] = thermometer.getTemperature();
      }
   }

   private int[] getPastTemperatures(){
      return pastTemps;
   }

   public void getWeatherReport(){
      for(int i=0; i<pastTemps.length; i++){
         System.out.println(i+":00 - "+pastTemps[i]+" degrees "+city);
      }
   }
}
