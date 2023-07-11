public class Statement extends Document{
  private String who;
  private String whom;

public Statement(String name, String who, String whom,String createdDate){
  super(name, createdDate);
  this.who = who;
  this.whom = whom;
}

  public String getWho() {
    return who;
  }

  public String getWhom() {
    return whom;
  }
  @Override
  public boolean isValid() {
    return super.isValid() && who != null && whom != null;
  }
}
