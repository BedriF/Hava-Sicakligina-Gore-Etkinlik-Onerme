import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz. : ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("Kayak yapabilirsin. ");
        }
        if(heat>=5 && heat<=15) {
            System.out.println("Sinemaya gidebilirsin. ");
        }
        if(heat>=10 && heat<=25) {
            System.out.println("Piknige gidebilirsiniz. ");
        }
        if(heat>25){
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }
    }
}