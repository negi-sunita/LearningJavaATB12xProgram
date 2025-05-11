package HarryClasses;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++){

            if (i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.print(i);
            System.out.println(" Java is great");
        }

    }
}
