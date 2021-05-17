spackage com.company;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String arr = scanner.nextLine();
            if(arr.equals("그만"))
            {
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(arr, " ");
            System.out.println("어절 개수는 " +st.countTokens());
        }
    }
}