package CandyMachine;
import java.util.Scanner;

public class CandyMachine {
   
  public static Object[][] item = {{"Candy Kopiko",2},{"Ice candy",2},{" Icool ",2},{"Gummy Bear",15},{"Nova",15},{"Royal",10}};
  public static void main(String[] args) throws Exception {
      
      System.out.println("Greetings In MF Candy Machine ");
      System.out.println("Here's What We Stored For You.");
      System.out.println();
           
        for (Object[] i: item) {
        for (Object m: i){
                System.out.print(m+" \t");
            }
      System.out.println();
        }
      System.out.println();
      System.out.println("What do you like to buy?");
      Scanner scanner = new Scanner(System.in);
      String buy = scanner.nextLine();
      buy.toLowerCase();
      buyItem(buy);
    }

   public static void buyItem(String buy){
     Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(!buy.equals(item[i][0])){
        if(i>item.length){
     System.out.println("the item you entered does not exist.");
     System.out.println("What do you like to buy?");
        buyItem(scanner.nextLine());
            }
            i++;
        }
     System.out.println(item[i][0]+" is "+item[i][1]+"buy it?");
    }
}