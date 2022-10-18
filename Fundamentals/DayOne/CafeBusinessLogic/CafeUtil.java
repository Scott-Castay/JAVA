import java.util.ArrayList;

public class CafeUtil {


    public int getStreakGoal(int numWeeks){
        int streakSum = 0;
        for (int i = 1; i < numWeeks; i++){
            streakSum += i;
        }
        return streakSum;
    }

    public double getOrderTotal(double[] prices){
        double orderTotal = 0.00;
        for (double price: prices) {
            orderTotal += price;
        }
    return orderTotal;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for(int i=0; i < menuItems.size(); i++){
            System.out.println(i + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello %s", userName));
        System.out.println(String.format("There are" + customers.size() + "people in front of you"));
        customers.add(userName);

        System.out.print(customers);

    }
}