package ex_09_Switch;
import java.util.*;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        System.out.println("Enter browser on which you want to run your test");
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        browser = browser.toLowerCase(Locale.ROOT);
        boolean isValid=false;

        while (!isValid){
            switch(browser){
                case "chrome":
                    System.out.println("Opening chrome browser");
                    System.out.println("Running TC1");
                    System.out.println("Running TC2");
                    isValid=true;
                    break;
                case "firefox":
                    System.out.println("Opening firefox browser");
                    System.out.println("Running TC1");
                    System.out.println("Running TC2");
                    isValid=true;
                    break;
                case "safari":
                    System.out.println("Opening safari browser");
                    System.out.println("Running TC1");
                    System.out.println("Running TC2");
                    isValid=true;
                    break;
                case "brave":
                    System.out.println("Opening brave browser");
                    System.out.println("Running TC1");
                    System.out.println("Running TC2");
                    isValid=true;
                    break;
                default:
                    System.out.println("Invalid browser");
                    browser = sc.next().toLowerCase(Locale.ROOT);
            }

        }
        sc.close();

    }
}
