import java.util.Scanner;

public class ToggleCase
{
    static String toggle(String word){
        String togStr="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>=65 && word.charAt(i)<=90)
            {
               togStr+= (char)(word.charAt(i)+32);
            } else if (word.charAt(i)>=97 && word.charAt(i)<=122) {

               togStr+= (char)(word.charAt(i)-32);
            }
            else {
                togStr+=(char) (word.charAt(i)+0);
            }
        }
        return togStr;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        System.out.println(toggle(word));
    }
}
