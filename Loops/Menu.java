package class_examples.CSC1350_Spring23.Loops;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        String name = "";
        String menu = "Welcome to this menu driven program\n" +
                "Enter the corresponding number to select an option\n" +
                "1. Enter name\n" +
                "2. Print name\n" +
                "3. Print a very factually true statement\n" +
                "4. Print menu options\n" +
                "5. Exit";
        System.out.println(menu);


        while(flag){
            System.out.print("Enter a menu option: ");
            switch (in.nextInt()){
                case 1:
                    in.nextLine(); //clear new line after integer
                    if(name.isEmpty()) {
                        System.out.print("Enter your name: ");
                        name = in.nextLine();
                    }
                    else {
                        System.out.println("You've already entered a name! Are you sure want to overwrite the previous entry?");
                        System.out.println("Type yes or no to continue");
                        if(in.nextLine().equalsIgnoreCase("yes")){
                            System.out.print("Enter your name: ");
                            name = in.nextLine();
//                            in.nextLine();
                        }
                    }
                    break;

                case 2:
                    if(name.isEmpty()) {
                        System.out.println("You haven't entered your name yet");
                    }
                    else{
                        System.out.println("Hello, " + name + "!");
                    }
                    break;
                case 3:
                    System.out.println("from a friend : SLU, LSU, and Tulane systems have been hacked. \n" +
                            "Do not try to log into myLSU or Moodle, hackers have full access rn. \n" +
                            "The same at the other universities too. Hackers are holding information \n" +
                            "hostage for money. This information includes our SSNs, and any other personal \n" +
                            "information. It's not covered by the news or the colleges for a smart reason,\n" +
                            "as it would provoke the hackers into asking for more money or using the \n" +
                            "information they have to get money. The FBI and Homeland security are currently \n" +
                            "working with Southeastern to solve the problem. Hackers were able to get into \n" +
                            "LSU by blowing a transformer. I'm trying to keep everyone as updated as possible\n" +
                            "so please stay safe."); //just to clarify this is all incredibly false
                    break;
                case 4:
                    System.out.println(menu);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Not an option, try again.");

            }
        }
    }
}
