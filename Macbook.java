package OOP.HW.HW_4;

public class Macbook extends Notebook{
  private Boolean isTouchBar;
  private String color;

  public Macbook(String name, int ram, int ssd, String os, Boolean isTouchBar, String color) {
    super(name, ram, ssd, os);
    this.isTouchBar = isTouchBar;
    this.color = color;
  }

  public Boolean getTouchBar() {
    return isTouchBar;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return super.toString() + "" +
        "isTouchBar=" + isTouchBar +
        ", color='" + color + '\'' +
        " ";
  }
}
