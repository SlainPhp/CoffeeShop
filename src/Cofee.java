public class Cofee extends MenuItem implements Preparable{
    private int strenght;
    private Size size;

    public Cofee(String name, double price, int strenght, Size size) {
        super(name, price);
        this.strenght = strenght;
    }


    @Override
    public void prepare() {
        System.out.println("Готовим кофе :" + name + " , крепость: " + strenght + " , размер: " + size + " , цена в р: " + price);

    }
    public int getStrenght() {
        return strenght;
    }
    public Size getSize(){
        return size;
    }
}
