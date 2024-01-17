package Advanced.Ch_2;

import java.util.ArrayList;
class Mygen<T1/*, T2, T3, T4... */> {
    int val;
    private T1 t1;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class Generis_Ex {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(21);
        ar.add(212);
        ar.add(643);
        int a = /*(int) useless*/ar.get(2);
        System.out.println(a);

        Mygen<String> mygen = new Mygen<>();
        mygen.setT1("Hi!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(mygen.getT1());

    }
}
