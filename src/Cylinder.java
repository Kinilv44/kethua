public class Cylinder {

    private int bankinh = 5;
    private String color = "blue";


    Cylinder(){}

    public Cylinder(int bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "bankinh=" + bankinh +
                ", color='" + color + '\'' +
                '}';
    }
}
