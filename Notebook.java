package OOP.HW.HW_4;

public class Notebook {
  private String name;
  private int ram;
  private int ssd;
  private String os;

  public Notebook(String name, int ram, int ssd, String os) {
    this.name = name;
    this.ram = ram;
    this.ssd = ssd;
    this.os = os;
  }

  @Override
  public String toString() {
    return "" +
        "name='" + name + '\'' +
        ", ram=" + ram +
        ", ssd=" + ssd +
        ", os='" + os + '\'';
  }

  public String getName() {
    return name;
  }

  public int getRam() {
    return ram;
  }

  public int getSsd() {
    return ssd;
  }

  public String getOs() {
    return os;
  }
}
