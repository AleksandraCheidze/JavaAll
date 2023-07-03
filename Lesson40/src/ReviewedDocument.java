import java.time.LocalDateTime;
public class ReviewedDocument <D>{
  /**
   * сам документ
   */
  private D document;
  /**
   * Текст отзыва
   */
  private String review;

  /**
   * Дата/время отзыва
   */
  private LocalDateTime reviewDateTime;

  public ReviewedDocument(D document, String review, LocalDateTime reviewDateTime) {
    this.document = document;
    this.review = review;
    this.reviewDateTime = reviewDateTime;
  }
}


