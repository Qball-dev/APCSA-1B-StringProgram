import java.util.Scanner;

public class StringProgram{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER WORDS, SEPRATE WITH * INSTEAD OF SPACES.");

        String str = input.nextLine();
        String result = "";

        int i = 0;

        while(str.indexOf("*") != -1){
            int index = str.indexOf("*");
            String temp = str.substring(i,index);

        }
    }
}