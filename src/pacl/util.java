package pacl;

import java.util.ArrayList;

public class util {
	public void findBookByName(String name, ArrayList<book> booklist){
		boolean isFound = false;
		for(int i = 0; i < booklist.size(); i++){
			if(name.equals(booklist.get(i).get_name())){
				System.out.println("Found the book: "+ booklist.get(i).get_num()+" " + booklist.get(i).get_name());
				isFound = true;
			}
		}
		if(!isFound){
			System.out.println("Cannot find the book!");
		}
		
	}
	public void findBookByNum(int num, ArrayList<book> booklist){
		boolean isFound = false;
		for(int i = 0; i < booklist.size(); i++){
			if(num == booklist.get(i).get_num()){
				System.out.println("Found the book: "+ booklist.get(i).get_num()+" " + booklist.get(i).get_name());
				isFound = true;
			}
		}
		if(!isFound){
			System.out.println("Cannot find the book!");
		}
	 
	}
	

}
