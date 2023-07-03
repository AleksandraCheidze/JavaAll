import java.time.LocalDateTime;
public class DocumentsRegistry <E>{
  public DocumentItem<E>[] items;
  public int count;

  public DocumentsRegistry() {
    this.items = new DocumentItem[10];
  }

  /**
   * Добавление нового документа в реестр
   * @param document добавляемый документ
   */
  public void add(E document) {
    DocumentItem<E> documentItem
        = new DocumentItem<>(document, LocalDateTime.now());

    items[count] = documentItem;
    count++;
  }

}
