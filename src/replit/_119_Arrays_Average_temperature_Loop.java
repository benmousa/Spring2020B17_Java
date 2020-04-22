package replit;

public class _119_Arrays_Average_temperature_Loop {
    public static void main(String[] args) {

        double[] temps = { 80 ,88, 88, 84, 82, 78, 60, 68 };

        int k = 0;
        double total = 0;
        double avgTemp = 0;

        for ( int i = 0; i <= temps.length-1; i++){
            total += temps[i];
            avgTemp = total / temps.length;
        }
        System.out.println(avgTemp);





    }
}
