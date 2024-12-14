import java.util.Scanner;

public class ExpenseSplitterApp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //PRINT WELCOME MESSAGE
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                // PRINT GODBYE MESSAGE (OPTIONAL)
                break;
            }
            
            String choice = scanner.nextLine();
            //PARSE TO INT
            //UTILITY CLASS CHECK THE INPUT IF WITHIN BOUNDS OR VALID
            
            switch (choice){
                case 1: // This is the create new group
                        // INSTANTIATE AN OBJECT OF GROUP CLASS WHICH CONTAINS METHOD CALLS FOR CREATING GROUP
                    break;
                case 2: //BACK TO MAIN SCREEN
                    break;
                default: // IDK SINCE WE HAVE INPUT VALIDATION MAYBE JUST RETURN STATEMENT TO END PROGRAM
                    break;
            }
            
            //DISPLAY MENU
            String ExpMntchoice = scanner.nextLine(); // THIS IS SUBJECT TO CHANGE PA SINCE WE HAVE UTILITY CLASS DEPENDS SA FINAL PLAN
            //PARSE TO INT
            //UTILITY CLASS CHECK THE INPUT IF WITHIN BOUNDS OR VALID

            switch (ExpMntchoice) {
                case "1": // CREATE NEW GROUP
                          // INSTANTIATE TO A CONSTRUCTOR CALL THAT HAS METHOD CALLS TO CREATE GROUP PROCESSES
                    break;
                case "2": // EDIT EXISTING GROUP
                          // INSTANTIATE TO A CONSTRUCTOR CALL TO EDIT A GROUP (USE GET METHODS)
                    break;
                case "3": // TRACK PAYMENTS
                          // INSTANTIATE TO A CONSTRUCTOR CALL TO TRACK PAYMENTS (USE GET METHODS)
                    break;
                case "4": // VIEW SUMMARY
                          // SAME TO 3
                    break;
                case "5": // EXIT TO WELCOME SCREEN
                    break;
                default: // IDK SINCE WE HAVE INPUT VALIDATION MAYBE JUST RETURN STATEMENT TO END PROGRAM
                    break;
            }
        }
        scanner.close();
    }
}