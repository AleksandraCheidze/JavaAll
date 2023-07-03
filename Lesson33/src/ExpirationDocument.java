import java.time.LocalDate;

public class ExpirationDocument extends Document{ //документ у которого есть срок действия

  protected LocalDate expiredDate;//когда заканчивается доверенность

  public ExpirationDocument(String name, LocalDate createdDate, LocalDate expiredDate){
    super(name, createdDate);
    this.expiredDate = expiredDate;
  }
  public boolean isExpired() {
    return expiredDate.isBefore(LocalDate.now());//дата окончания должна быть до текущей даты
  }

}
