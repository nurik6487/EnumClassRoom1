import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println(WEEKS.MONDAY);
                break;
            case 2:
                System.out.println(WEEKS.Tuesday);
                break;
            case 3:
                System.out.println(WEEKS.Wednesday);
                break;
            case 4:
                System.out.println(WEEKS.Thursday);
                break;
            case 5:
                System.out.println(WEEKS.Friday);
                break;
            case 6:
                System.out.println(WEEKS.Saturday);
            case 7:
                System.out.println(WEEKS.Sunday);
            default:
                System.out.println("Takogo nety!!!");

                System.out.println(a);
        }
    }
}