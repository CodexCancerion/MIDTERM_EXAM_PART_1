import java.util.Comparator;

public class AmountDueComparator implements Comparator<Sales> {
    @Override
    public int compare(Sales o1, Sales o2) {
        return Double.compare(o1.getAmountDue(), o2.getAmountDue());
    }
}
