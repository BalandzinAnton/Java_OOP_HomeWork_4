package OOP.HW.HW_4;

public class HP extends Notebook {
  private Boolean isCamera;
  private String isCharger;

  public HP(String name, int ram, int ssd, String os, Boolean isCamera, String isCharger) {
    super(name, ram, ssd, os);
    this.isCamera = isCamera;
    this.isCharger = isCharger;
  }


  public Boolean getCamera() {
    return isCamera;
  }

  public String getIsCharger() {
    return isCharger;
  }

  @Override
  public String toString() {
    return super.toString() + "" +
        "isCamera=" + isCamera +
        ", isCharger='" + isCharger + '\'' +
        " " ;
  }
}
