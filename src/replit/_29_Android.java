package replit;

public class _29_Android {
    public static void main(String[] args) {

        double version = 3.1;

        String output = " ";

        if ( version == 1.5 ){
            output = "Cupcake";
        }
        else if( version == 1.6){
            output = "Dount";
        }
        else if( version == 2.1){
            output = "Eclair";
        }
        else if ( version == 2.2){
            output = "Froyo";
        }
        else if ( version == 2.3){
            output = "Gingeerbread";
        }
        else if ( version == 3.1){
            output = "Honeycomb";
        }
        else if ( version == 4.0){
            output = "Ice Cream Sandwich";
        }
        else if ( version >= 4.1 && version <= 4.31){
            output = "Jelly Bean";
        }
        else if ( version >= 4.4 && version <= 4.44){
            output = "KitKat";
        }
        else if ( version >= 5.0 && version <= 5.11){
            output = "Lollipop";
        }
        else if ( version >= 8.0 && version <= 8.1){
            output = "Oreo";
        }
        else if ( version == 9.0) {
            output = "Pie";
        }
        else {
            output = "Sorry, I don't know this version!";
        }
        System.out.println(output);

    }
}
