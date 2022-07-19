public class WeatherMachine{
   int[] pastTemps;
   Thermometer thermometer;

   public WeatherMachine(){
      pastTemps = new int[24];
      thermometer = new Thermometer();

      for(int i=0; i<pastTemps.length; i++){
         pastTemps[i] = thermometer.getTemperature();
      }
   }

   private int[] getPastTemperatures(){
      return pastTemps;
   }

   public void getWeatherReport(){
      for(int i=0; i<pastTemps.length; i++){
         System.out.println(i+":00 - "+pastTemps[i]+" degrees");
      }
   }
}
