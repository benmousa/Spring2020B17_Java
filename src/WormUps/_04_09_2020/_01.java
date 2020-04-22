package WormUps._04_09_2020;

public class _01 {
    public static void main(String[] args) {

      /*  write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"

       */

      String str = "PPPMCCCCATTISGGOKKKNXXXXXXXXX";
      String result = "";

      for ( int i = 0; i <= str.length()-1; i++){
          char chara = str.charAt(i);
          int count = 0;

          for ( int j = 0; j <= str.length()-1; j++){
              char chara2 = str.charAt(j);

              if(chara == chara2 ){
                  count++;
              }
          }
          if ( count == 1){
              result += chara;
          }
      }


        System.out.println(result);

    }
}
