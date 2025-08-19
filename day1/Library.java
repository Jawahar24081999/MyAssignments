package week2.day1;



public class Library {
	
	public void addBook() {
		// TODO Auto-generated method stub
		System.out.println("Book added successfully");
		return;
		
		

	}
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");

	}
	public String bookTitle() {
		// TODO Auto-generated method stub
		return "bookTitle";

	}
	public static void main(String[] args) {
		Library book=new Library();
		book.addBook();
		book.issueBook();
		String bookTitle=book.bookTitle();
		System.out.println(bookTitle);
		
		
		
	}
	
}
