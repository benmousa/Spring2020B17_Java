package Day28_DateTime;

import java.time.LocalDate;

public class WormUps {
    /*
    1. create an array of string, store five of your friends names in it
	2. create Array of localDates and store their birthdays in the same order
	3. use for loop to print out your friends' names and their birthdays
     */
    public static void main(String[] args) {

        String [] friends = { "Osama", "Ali", "Ahmed", "Momaen", "Moaen"};

        LocalDate[] birth = {LocalDate.of(1983,3,2), LocalDate.of(1895,3,8),
                             LocalDate.of(1982,7,9), LocalDate.of(1999,1,1),
                             LocalDate.of(1993,4,3) };

        for ( int i = 0; i <= friends.length-1; i++){
            String name = friends[i];
            LocalDate dates = birth[i];
            System.out.println(name +" birthday is: " +dates);
        }

    }
}
