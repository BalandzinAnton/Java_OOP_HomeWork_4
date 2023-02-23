package OOP.HW.HW_4;

public class Dell extends Notebook {
  private Boolean isManualBook;
  private Boolean isCamera;
  private String isCharger;

  public Dell(String name, int ram, int ssd, String os, String color, Boolean isManualBook,
      Boolean isCamera, String isCharger) {
    super(name, ram, ssd, os);
    this.isManualBook = isManualBook;
    this.isCamera = isCamera;
    this.isCharger = isCharger;
  }

  public Boolean getManualBook() {
    return isManualBook;
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
        "isManualBook=" + isManualBook +
        ", isCamera=" + isCamera +
        ", isCharger='" + isCharger + '\'' +
        " ";
  }
}
