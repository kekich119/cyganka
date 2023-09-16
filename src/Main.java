import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        while (true) {

            int shans = 0;


            Scanner in = new Scanner(System.in);


            System.out.println("Добро пожаловать в <ДАЙ РУЧКУ, ПОГОДАЮ>");
            System.out.println("Впишите существительное и глагол, типо <Я стану президентом> ");
            String predlosh = in.nextLine();


            System.out.println("Шанс что" + " " + predlosh + ": " + getran());
        }
    }


    public static int getran(){

        return (int) (Math.random() * 10) +1 ;
    }




}