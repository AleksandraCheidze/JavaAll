import java.time.LocalDate;

public class Document {
  protected LocalDate createdDate;// дата выпуска документа
  private String name;//название документа
  public Document(String name){
    this.name = name;
    this.createdDate = LocalDate.now();//взяли текущую дату
  }
  public Document (String name, String createdDate){
    this.name = name;
    this.createdDate = LocalDate.parse(createdDate);// дату можно передать как строку
  }
  public Document(String name, LocalDate localDate){
    this.name = name;
    this.createdDate = createdDate;
  }

  public boolean isExpired(){
    return false;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public String getName() {
    return name;
  }
}
