import java.io.*;
import java.util.*;

public class ListProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayNumber = sc.nextInt();
        sc.nextLine();
        List<String> array = new ArrayList<>();
        
        String[] input = sc.nextLine().replaceAll("\\s+$", "").split(" ");
        
        if(input.length == arrayNumber){
            //array = Arrays.asList(input);
            for (String string : input) {
                array.add(string);
            }
            int queriesNum = sc.nextInt();
            sc.nextLine();
            
            boolean queryflag = false;
            String insertOrDelete = "";
            for (int i = 1; i <= queriesNum*2; i++) {
                if(!queryflag){
                    insertOrDelete = sc.nextLine();
                    queryflag= true;
                }
                else{
                    if(insertOrDelete.equals("Insert")){
                        String[] temp = sc.nextLine().replaceAll("\\s+$", "").split(" ");
                        array.add(Integer.parseInt(temp[0]),temp[1]);
                        queryflag = false;
                    }
                    else if(insertOrDelete.equals("Delete")){
                        String temp = sc.nextLine();
                        array.remove(Integer.parseInt(temp));
                        queryflag = false;
                    }
                    else{
                        System.out.println("Not Valid");
                        System.exit(1);
                    }
                    
                    
                }
            }
            for (String string : array) {
                System.out.print(string+" ");
            }
        }
    }
}
