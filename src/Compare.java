import java.util.Comparator;
public class Compare implements Comparator<Parinte> {
    @Override
    public int compare(Parinte a, Parinte b) {
        return a.getName().compareTo(b.getName());
    }
}
