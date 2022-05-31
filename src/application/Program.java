package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("07/11/2003");
		
		Department dep = new Department(5, "livros");
		Seller seller = new Seller(5, "carlos", "carlos@gmail.com", date, 5000.0, dep);
		
		System.out.println(dep);
		System.out.println(seller);

	}

}
