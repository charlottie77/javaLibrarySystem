package pacl;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]){
		ArrayList<book> booklist = new ArrayList<book>();
		booklist.add(new book(1,"Fault Lines"));
		booklist.add(new book(2,"Too Big to Fall"));
		booklist.add(new book(3,"The Plundered Planet"));
		booklist.add(new book(4,"The Rational Optimist"));
		booklist.add(new book(5,"The Upside of Irrationality"));
		
		util searcher = new util();
		
		System.out.println("Please choose your search key:");
		System.out.println("1 for book name, 2 for book number");
		Scanner s = new Scanner(System.in);
		int co = s.nextInt();
		s.nextLine();
		//ªÚ’ﬂ”√Interger.parseInt(s.nextLine())
			if(co == 1){
				System.out.println("Search books by book name:");
				System.out.println("Please input the book name:");
				String bookName = s.nextLine();
				searcher.findBookByName(bookName, booklist);
			}
			if(co == 2){
				System.out.println("Search books by book number:");
				System.out.println("Please input the book number:");
				int bookNum = s.nextInt();
				searcher.findBookByNum(bookNum, booklist);
			}
		
	}

}


