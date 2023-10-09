import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        List<Parinte> Lista=new ArrayList<>();
        Lista.add(new Parinte("Andreea"));
        Lista.add(new Copil("Badea"));
        Lista.add(new Parinte("Ioana"));

        for(Parinte s:Lista){
            System.out.println(s);
        }
        Lista.sort(new Compare());

    }

}