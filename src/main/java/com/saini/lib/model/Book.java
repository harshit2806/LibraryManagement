import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Book {
	    @Id
		private Integer bookIdNo;
		private String  bookName;
		private String  authorName;
		private Integer noOfBooks;
		
		
}
