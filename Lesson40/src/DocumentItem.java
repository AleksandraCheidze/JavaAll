import java.time.LocalDateTime;
public class DocumentItem <T> {

  /**
   * Поле, которое хранит документ определенного типа
   */
  private T document;
  /**
   * Дата создания документа
   */
  private LocalDateTime createdAt;

  public DocumentItem(T document, LocalDateTime createdAt) {
    this.document = document;
    this.createdAt = createdAt;

  }
}
