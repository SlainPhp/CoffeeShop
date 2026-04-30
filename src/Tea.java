public class Tea extends MenuItem implements Preparable{
    public Tea(String name, double price, String teaType) {
        super(name, price);
        this.teaType = teaType;
    }
    private String teaType;

    @Override
    public void prepare() {
        System.out.println("Завариваем чай: " + name + " , тип: " + teaType + " , цена в р: " + price);
    }
    public String getTeaType() {
        return teaType;
    }
}
