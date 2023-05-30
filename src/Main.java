import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Standard form or vertex form?");

        System.out.println("Enter in an equation please. ");
        String x = scan.nextLine();
        Vertex v1 = new Vertex(x);
        v1.present();


    }

}
