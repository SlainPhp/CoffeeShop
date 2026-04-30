import java.util.HashMap;
import java.util.Map;

public class CoffeeShopStats{
    private static Map<String, Integer> salesCount =   new HashMap<>();
    private static  double totalRevenue = 0.0;

    public static void recordSale(MenuItem item, int quantity){
        String itemName = item.getName();
        salesCount.put(itemName, salesCount.getOrDefault(itemName, 0) + quantity);
        totalRevenue += item.getPrice() * quantity;

    }
    public static void printStats() {
        for (Map.Entry<String, Integer> entry : salesCount.entrySet()){
            System.out.println(entry.getKey() + ": продано " + entry.getValue() + " шт");
        }
        System.out.printf("Общий доход: $%.2f%n", totalRevenue);
    }
}

