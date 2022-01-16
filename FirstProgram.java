import java.util.Scanner;
public class FirstProgram{
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int score = 0;
   System.out.println("Which is the capital of Armenia");
   String capOfArm = sc.next();
   if(capOfArm.equals("Yerevan")){
       score++;
   }
   System.out.println("Which is the capital of France");
   String capOfFR = sc.next();
   if(capOfFR.equals("Paris")){
       score++;
   }
   System.out.println("Which is the capital of USA");
   String capOfUsa = sc.next();
   if(capOfUsa.equals("Washington")){
       score++;
   }
   
   System.out.println("You gained "+score+" out of 3");
   
    }

}