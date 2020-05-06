package basic.syntax.classobject;

public class ImmutableFields {

    final private float MY_PI;
    private float banKinh;

    public ImmutableFields(float my_pi, float banKinh) {
        this.MY_PI = my_pi;
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getMY_PI() {
        return MY_PI;
    }

    public float tinhChuVi(){
        return 2*MY_PI*banKinh;
    }

    public static void main(String[] args) {
        ImmutableFields shape = new ImmutableFields(3.14f,2.5f);
        System.out.println("Chu vi la: " + shape.tinhChuVi());

        shape.setBanKinh(1.0f);
        System.out.println("Chu vi la: " + shape.tinhChuVi());

        //=> another solution for final fields: enum
    }
}
