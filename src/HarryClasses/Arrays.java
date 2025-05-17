package HarryClasses;

public class Arrays {
    public static void main(String[] args) {
        //Classroom of 5 students - Store marks of these students
//        int [] marks = new int [5];
//        marks[0] = 100;
//        marks[1] = 90;
//        marks[2] = 80;
//        marks[3] = 70;
//        marks[4] = 60;
//        System.out.println(marks[0]);
//
//        String [] name = {"Sunita","Ansh", "Prem", "Kalyan"};
//        name[1] = "Ansh Raj";
//        System.out.println(name[1]);

        int [] marks = {100,90,88,75,60,98,54,77,99};

//        for (int i = 0;i<marks.length;i++) {
//            System.out.println(marks[i]);
//        }
//        for (int i = marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
        for (int i :marks){
            System.out.println(i);
        }

    }
}
