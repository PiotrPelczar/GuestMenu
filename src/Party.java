import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Party {

    Scanner scanner = new Scanner(System.in);



    List<Guest> guests = new ArrayList<>();
    Set<String> meals = new HashSet<>();
    Map<Integer, Guest> phoneToGuest = new HashMap<>();




    public void viewList (){
    for (Guest guest : guests)
        guest.displayGuestInformation();
        System.out.println();

        }





    public void addingGuests () {
        System.out.println("Plese enter new guests name: ");
        String name = scanner.nextLine();

        System.out.println("Enter guests meal: ");
        String meal = scanner.nextLine();

        System.out.println("Enter guests telephone number: ");
        int telephone = Integer.valueOf(scanner.nextLine());


        System.out.println("Is guest a vegetarian? [Y/N]: ");
        String vegetarian = scanner.nextLine();

        boolean isVegan;

        if (vegetarian.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, telephone, isVegan);
        meals.add(meal);
        phoneToGuest.put(telephone, guest);
        guests.add(guest);

    }

    public void viewMeals(){
        System.out.println(meals);
    }

    public void displayPhoneNoAndGuest(){
        int telephoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(telephoneNumber);

        guest.displayGuestInformation();
    }








    }

