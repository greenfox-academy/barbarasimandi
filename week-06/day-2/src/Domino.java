import java.util.ArrayList;
import java.util.Comparator;

public class Domino implements Comparable<Domino>, Printable {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  public int getFirstNumber() {
    return getValues()[0];
  }

  public int getSecondNumber() {
    return getValues()[1];
  }


  public int compareTo(Domino otherDomino) {

    if (this.getFirstNumber() != otherDomino.getFirstNumber()) {
      return this.getFirstNumber() - otherDomino.getFirstNumber();
    }
    else {
      return this.getSecondNumber() - otherDomino.getSecondNumber();
    }
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public void printAllFields() {
    System.out.println(toString());
  }
}
