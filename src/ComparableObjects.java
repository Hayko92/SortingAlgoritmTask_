public class ComparableObjects implements Comparable{
    private int number;

    public ComparableObjects(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
        return this.number-((ComparableObjects)o).getNumber();
    }

    @Override
    public String toString() {
        return "ComparableObjects{" +
                "number=" + number +
                '}';
    }
}
