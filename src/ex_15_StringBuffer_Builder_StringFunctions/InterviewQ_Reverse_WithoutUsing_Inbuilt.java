package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String name = "Sunita";
        for (int i = name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
