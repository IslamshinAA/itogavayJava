import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static String userSInput(String msg){
    Scanner sc = new Scanner(System.in);
    String inputStr;
    while (true){
      System.out.println(msg);
      try{
        inputStr = sc.nextLine();
        break;
      } catch (NumberFormatException e){
        System.out.println("Неверный ввод!");
      }
    }
    return inputStr;
  }
    
    public static void main (String[] args) {
      ArrayList<Notebook> book = new ArrayList<>();

      Notebook nBook1 = new Notebook(16,500, "windows", "black");
      Notebook nBook2 = new Notebook(8,250, "no os", "red");
      Notebook nBook3 = new Notebook(32,1000, "windows", "green");
      Notebook nBook4 = new Notebook(64,1000, "linux", "red");
      Notebook nBook5 = new Notebook(16,500, "windows", "black");
      Notebook nBook6 = new Notebook(8,250, "linux", "blue");
      Notebook nBook7 = new Notebook(32,500, "no os", "white");
      Notebook nBook8 = new Notebook(64,250, "windows", "black");
      Notebook nBook9 = new Notebook(16,500, "no os", "silver");

      book.add(nBook1);
      book.add(nBook2);
      book.add(nBook3);
      book.add(nBook4);
      book.add(nBook5);
      book.add(nBook6);
      book.add(nBook7);
      book.add(nBook8);
      book.add(nBook9);

      Scanner scanner = new Scanner(System.in);
      System.out.println("Добро пожаловать в наш магазин по продаже ноутбков!\n " +
              "Введите ЦИФРУ интересующего вас параметр:\n" +
              "1 - ОЗУ\n" +
              "2 - Объем Жесткого диска\n" +
              "3 - Операционная система\n" +
              "4 - Цвет ");

      if(scanner.hasNextInt()) {
        int num = scanner.nextInt();
          if(num == 1) {
            String parametr = userSInput("Какой объем оперативной памяти вас интересует? 8гб, 16гб, 32гб, 64гб.");
            int a = Integer.parseInt(parametr);
            for (Notebook ram: book ) {
                if(ram.getRam().equals(a)){
                  System.out.println(ram.toString());
                }
            }
            System.out.println("Перечень ноутбуков с оперативной памятью: " + a);
          }

          if(num == 2) {
            String parametr = userSInput("Какой объем жестеого диска вас интересует? 250 Гб, 500 Гб, 1000 Гб");
            int a = Integer.parseInt(parametr);
            for (Notebook hdd: book ) {
              if(hdd.getHdd().equals(a)){
                System.out.println(hdd.toString());
              }
            }
            System.out.println("Перечень ноутбуков с выбранным вами объемом жесткого диска: " + a );
          }
          if(num == 3) {
            String parametr = userSInput("Какая операционная система вас интересует? windows, linux, no os.");
            for (Notebook oc: book ) {
              if(oc.getOc().equals(parametr)){
                System.out.println(oc.toString());
              }
            }
            System.out.println("Ноутбуки с выбранной вами системой!");
          }
          if(num == 4) {
            String parametr = userSInput("Какой цвет ноутбука вам интересен? black, red, green, white, blue, silver");
            for (Notebook color: book ) {
              if(color.getColor().equals(parametr)){
                System.out.println(color.toString());
              }
            }
            System.out.println("Ноутбуки с выбранным вами цветом!");
          }
      }
      else System.out.println("Вы ввели некоректные данные!");
    }
}
 