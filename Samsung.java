package OOP.HW.HW_4;

public class Samsung extends Notebook{
  private Boolean isCamera;
  private String isCharger;
  private Boolean isTouchBar;

  public Samsung(String name, int ram, int ssd, String os, Boolean isCamera, String isCharger,
      Boolean isTouchBar) {
    super(name, ram, ssd, os);
    this.isCamera = isCamera;
    this.isCharger = isCharger;
    this.isTouchBar = isTouchBar;
  }

  @Override
  public String toString() {
    return super.toString() + "" +
        "isCamera=" + isCamera +
        ", isCharger='" + isCharger + '\'' +
        ", isTouchBar=" + isTouchBar +
        " " ;
  }
}
