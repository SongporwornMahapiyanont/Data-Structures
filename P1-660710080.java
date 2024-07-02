import java.util.InputMismatchException;
import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Created by 660710080 Songporworn Mahapiyanont");
                float average = 0;
                while (true) {
                    System.out.println("Input the number of Your time (Interger only) : ");
                    try {
                        int n = scan.nextInt();
                        if (n%2==0) {
                            System.out.println("Input Your value " + Integer.toString(n) + " time : ");
                            
                            for(int i=0;i<n;i++)
                            {
                                int value = scan.nextInt();
                                average+=value;
                            }
                            average = average/n;
                            System.out.println("Average = " + String.format("%.2f", average));
                            break;
                        }
                        else
                        {
                            System.out.println("Input again: ");
                        }
                    }
                    catch (InputMismatchException e) 
                    {
                        System.out.println("Error. Please,Run code again And Do not Bug!! My code bro!!!");
                        System.out.println("Error. Please,Run code again And Do not Bug!! My code bro!!!");
                        System.out.println("Error. Please,Run code again And Do not Bug!! My code bro!!!");
                        System.out.println("Error. Please,Run code again And Do not Bug!! My code bro!!!");
                        System.out.println("Error. Please,Run code again And Do not Bug!! My code bro!!!");
                        System.out.println("Error. Please,Run code again And Do not Bug!! My code bro!!!");
                        break;
                    }
                }
                

    }
}