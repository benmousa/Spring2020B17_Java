package Day14_StringClass;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your website please");
        String webSite = data.nextLine();
        webSite = webSite.toLowerCase();

        if (webSite.startsWith("www.") && webSite.endsWith(".com")) {
            System.out.println("Valid website");
        }
        else if (webSite.startsWith("www.") && webSite.endsWith(".edu")){
            System.out.println("Vaild website");
        }
        else if (webSite.startsWith("www.") && webSite.endsWith(".net")){
            System.out.println("Valid website");
        }
        else if (webSite.startsWith("www.") && webSite.endsWith(".gov")) {
            System.out.println("Valid website");
        }
        else{
            System.out.println("Invalid website");
        }

    }}