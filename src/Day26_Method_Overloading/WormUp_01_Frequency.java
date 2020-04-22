package Day26_Method_Overloading;

public class WormUp_01_Frequency {
    /*
    1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */
    public static void main(String[] args) {

        String str2 = "AAAABCC";
        char ch5 = 'A';

        int count2 = 0;

       while( str2.contains(""+ch5)){
           count2++;
           str2 = str2.replaceFirst(""+ch5, "");
       }
        System.out.println(count2);

        System.out.println("><><><><><><><><><><><><><");

        String str = "AAAABCCCC";

        char[] arr = str.toCharArray();

        char chr = 'C';

        int add = 0;
        for (char each : arr ){
            if (each == chr){
                add++;
            }
        }
        System.out.println(add);
        String[] word4 = { "A", "A","A", "A", "A", "A", "B", "B", "B", "B", "C", "C", "C", "C", "C", "C", "C"};
        char chh = 'A';

        System.out.println("^_^    ^_^    ^_^    ^_^    ^_^    ^_^     ^_^     ^_^ ");

       // int count4 = Frequency(word4,'C');
        //System.out.println(count4);
    }

    public static int Frequency (String str, char ch){

        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr ){
            if (each == ch){
                count++;
            }
        }
        return count;
    }
}
