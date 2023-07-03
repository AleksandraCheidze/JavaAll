import java.time.LocalDate;

public class DriverLicense extends ExpirationDocument {

  private String category;
  private String driver;


  public DriverLicense(String driver, String category){
    super("Водительские права", LocalDate.now());
    this.driver = driver;
    this.category = category;
    this.expiredDate = this.createdDate.plusYears(10);//дата окончания = дата создания + 10 лет
  }


}
