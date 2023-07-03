import java.time.LocalDate;

public class Attorney extends ExpirationDocument {// доверенность
  private String whom;//на кого доверенность
  private String who;//кто доверяет


  public Attorney(String name, String who, String whom, String expiredDate) {
    super(name);
    this.who = who;
    this.whom = whom;
    this.expiredDate = LocalDate.parse(expiredDate);
  }

  public Attorney(String name, String who, String whom, String createdDate, String expiredDate) {
    super(name, createdDate);
    this.who = who;
    this.whom = whom;
    this.expiredDate = LocalDate.parse(expiredDate);

  }

 @Override


  public String getWhom() {
    return whom;
  }

  public String getWho() {
    return who;
  }

  public LocalDate getExpiredDate() {
    return expiredDate;
  }
}
