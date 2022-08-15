import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        Party p = new Party();


        boolean shouldCountinue = true;

        while (shouldCountinue){
            System.out.println("Choose an option:");
            System.out.println("1. View guest list");
            System.out.println("2. Add a guest");
            System.out.println("3. View menu");
            System.out.println("4. Find a guest by telehone number");
            System.out.println("5. Exit");

            int usersChoice = scanner.nextInt();


            switch (usersChoice) {
                case 1 :
                   p.viewList();
                    break;
                case 2 :
                    p.addingGuests();
                    break;
                case 3 :
                    p.viewMeals();
                    break;
                case 4 :
                    p.displayPhoneNoAndGuest();
                    break;
                case 5 :
                    System.out.println("1");
                    shouldCountinue = false;

            }
        }



    }
}
