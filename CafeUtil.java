import java.util.ArrayList;
import java.util.Arrays;

class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        int i = 0;
        while(i < 11) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public double getOrderTotal(double[]prices) {
        double orderTotal = 0;
        for(int i = 0; i < prices.length; i++) {
            orderTotal = orderTotal + prices[i];
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String>menuitems) {
        for(int i = 0; i < menuitems.size(); i++){
            System.out.println(i + " " + menuitems.get(i));
        }
    }
    //below is example of enhanced loop
        // int i = 0;
        // for(String item : menuitems){
        //     System.out.println(item);
        // }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

}