public class Guest {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public Guest(String name, String meal, int telephoneNo, boolean isVeg) {
        this.name = name;
        this.meal = meal;
        this.telephoneNo = telephoneNo;
        this.isVeg = isVeg;
    }

    private String name;
    private String meal;
    private int telephoneNo;
    private boolean isVeg;



    public void displayGuestInformation() {
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Telephone number "+ telephoneNo);
        System.out.println("Is the guest vegan? " );
    }
}
