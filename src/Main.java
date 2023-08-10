import java.text.DecimalFormat;

class Candle {
    String name;
    int quantity;
    double burnTime;
    double dollarPerBurnTime;
    double price;

    Candle(String name, int quantity, double burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
        this.dollarPerBurnTime = price / burnTime;
    }

    double getSubtotal() {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Candle candle1 = new Candle("Dior", 2, 6, 80.50);
        Candle candle2 = new Candle("Maple", 5, 7, 22.50);
        Candle candle3 = new Candle("summer", 2, 12, 15.75);


        int totalBurnTime = (int) (candle1.burnTime * candle1.quantity +
                candle2.burnTime * candle2.quantity +
                candle3.burnTime * candle3.quantity );


        double totalDollarPerBurnTime = (candle1.price + candle2.price + candle3.price);


        double totalPrice = candle1.getSubtotal() + candle2.getSubtotal() + candle3.getSubtotal();


        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // Print details for candle1, candle2, candle3
        System.out.println(candle1.name);
        // ...
        System.out.println(candle2.name);
        // ...
        System.out.println(candle3.name);
        // ...
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");


        // ...
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);
    }
}