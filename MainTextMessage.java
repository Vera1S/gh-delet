package Homework;

import java.util.Scanner;

public class MainTextMessage {
    public static void main(String[] args) {
        //конструктор по умолчанию.
        TextMessage textMessage = new TextMessage();
        textMessage.wordOfChange = " ";
        System.out.println(textMessage);

        TextMessage textMessage1 = new TextMessage("!"){

        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String word1 = sc.next();
        String text = "I don't give a fuck";
        String textOfChange = text.replaceFirst("fuck", "fk");
        System.out.println(textOfChange);
        String t = sc.nextLine();
        System.out.print("Введите сообщение: ");
        String word2 = sc.next();
        String text1 = "I don't give a bullshit";
        String textOfChange1 = text1.replaceFirst("bullshit", "b***t");
        System.out.println(textOfChange1);
        String e = sc.nextLine();
        System.out.print("");
        String word3 = sc.next();
        String text2 = "You're a bad person";
        String textOfChange2 = text2.replaceFirst("bad", "good");
        System.out.println(textOfChange2);


    }
}
