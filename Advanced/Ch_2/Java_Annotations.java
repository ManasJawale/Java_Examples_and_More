package Advanced.Ch_2;

class Base1 {
    public int getX() {
        return 1;
    }
}
class newClass extends Base1 {
    @Override
    public int getX() {

        return 0;
    }

}
public class Java_Annotations {
    public static void main(String[] args) {
        int a = new newClass().getX();
        System.out.println(a);

    }
}
