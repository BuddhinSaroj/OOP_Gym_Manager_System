import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        MenuLoop:
        while (true) {
            System.out.println("\n*****************************************************************************");
            System.out.println("*Press '1' to Add a new member                     *");
            System.out.println("*Press '2' to delete existing member               *");
            System.out.println("*Press '3' to print the list of members            *");
            System.out.println("*Press '4' to sort the members in ascending order  *");
            System.out.println("*Press '5' to write/save in a file                 *");
            System.out.println("*Press '6' to open a GUI                           *");
            System.out.println("*Press '7' to quit the programme                   *");
            System.out.println("*****************************************************************************");
            System.out.println("*Please Enter your option here : ");

            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    addNewMember();
                    break;
                case 2:
                    deleteExistingMember();
                    break;
                case 3:
                    printTheListOfMembers();
                    break;
                case 4:
                    sortTheMembers();
                    break;
                case 5:
                    saveInFile();
                    break;
                case 6:
                    opnGUI();
                    break;
                case 7:
                    System.out.println("Program is terminated...Thank you!");
                    System.exit(0);
                    break;
            }
        }
    }

    private static void addNewMember() {
    }

    private static void deleteExistingMember() {
    }

    private static void printTheListOfMembers() {
    }

    private static void sortTheMembers() {
    }

    private static void saveInFile() {
    }

    private static void opnGUI() {
    }


}
