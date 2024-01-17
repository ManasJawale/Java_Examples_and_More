package Advanced.Ch_2;

interface Anomy {
    void print(String str);
    void println(String str);
}
public class Lambda {
    public static void main(String[] args) {
        Anomy obj = new Anomy() {
            @Override
            public void print(String str) {
                System.out.print(str);
            }

            @Override
            public void println(String str) {
                System.out.println(str);
            }
        };

        obj.print("hi");
        obj.println("hi, next line");
    }
}
