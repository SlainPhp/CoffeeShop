import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeShop {
    private List<MenuItem> menu;
    private String shopName;
    private List<Order> orders;

    public CoffeeShop(String shopName) {
        this.shopName = shopName;
        this.orders = new ArrayList<>();
        this.menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
        System.out.println("Добавлен в меню: " + item.getName());
    }


    public static class CoffeeShopStats {
        private static int totalOrders = 0;
        private static double totalRevenue = 0;

        public static void addOrder(int price) {

        }
    }

    public class Order {
        private List<MenuItem> items;
        private double totalPrice;


        public Order() {
            this.items = new ArrayList<>();
            this.totalPrice = 0.0;
        }

        public void addItem(MenuItem item) {
            items.add(item);
            totalPrice += item.getPrice();
        }

        public void prepareOrder() {
            System.out.println("Подготовка заказа");
            for(MenuItem item: items){
                if(item instanceof Preparable){
                    ((Preparable) item).prepare();
                }else{
                    System.out.println("Выдача: " + item.getName() + ", цена: Р" + item.getPrice());
                }

            }

        }
        public void displayOrder() {
            System.out.println("Заказ в кофейне " + shopName + " : ");
            for(MenuItem item : items){
                System.out.println("- " + item.getName() + "(P" + item.getPrice() + ")");
            }
            System.out.println("Итого: P" + totalPrice);
        }
        public Order createOrder(){
            Order order = new Order();
            orders.add(order);
            return order;
        }
        public void displayMenu(){
            System.out.println("Меню кофейни: " + shopName + ":");
            for (MenuItem item: menu){
                System.out.println("- " + item.getName() + ": P" + item.getPrice());
            }
        }

    }
}
