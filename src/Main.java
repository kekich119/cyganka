import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        while (true) {

            int shans = 0;


            Scanner in = new Scanner(System.in);


            System.out.println("����� ���������� � <��� �����, �������>");
            System.out.println("������� ��������������� � ������, ���� <� ����� �����������> ");
            String predlosh = in.nextLine();


            System.out.println("���� ���" + " " + predlosh + ": " + getran());
        }
    }


    public static int getran(){

        return (int) (Math.random() * 10) +1 ;
    }




}