package Tasks;

public class Task5 {
    public static void main(String[] args) {

        int n1 = 60;
        int n2 = 60;
        int n3 = 60;

        if (n1 == n2 && n1 == n3){
            System.out.println("Triangle is equilateral - all sides equal");
        }
        else if (n1 == n2 || n1 == n3 || n2 ==n3){
            System.out.println("Triangle is isosceles - 2 sides equal");
        }
        else{
            System.out.println("Triangle is scalene - no sides are equal");
        }

    }
}
