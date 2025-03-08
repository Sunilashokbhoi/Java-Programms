package jdbc;
import java.util.*;
import java.sql.*;
public class Product2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sunil","sunil");
		Statement stm = con.createStatement();
		while(true) {
		System.out.println("enter Your Choice");	
			System.out.println("1)ADDProduct\n2)ViewAllOroduct\n3)ViewProductById");
			int choice = sc.nextInt();
			switch(choice)
			{

			case 1:
				System.out.println("Added Product ");
				System.out.println("Enter Product Code");
				int pcode = sc.nextInt();
				System.out.println("Enter Name ");
				String pname= sc.next();
				System.out.println("Enter Product Price");
				int pprice = sc.nextInt();
				System.out.println("Enter Product Qty");
				int pqty = sc.nextInt();
				int k =stm.executeUpdate("insert into product72 values("+pcode+",'"+pname+"',"+pprice+","+pqty+")");
				if(k>0) {
					System.out.println("Product Added Succsessfully...");
			}
				break;
			case 2:
				System.out.println("ViewAllProducts");
				ResultSet rs = stm.executeQuery("select * from product72");
				while(rs.next()) {
					System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getLong(3)+"\t"+rs.getLong(4));
				}
				break;
			case 3:
				System.out.println("Enter code By Product");
				int vcode = sc.nextInt();
				ResultSet vrs = stm.executeQuery("select * from product72 where code="+vcode);
				if(vrs.next()) {
					System.out.println(vrs.getLong(1)+"\t"+vrs.getString(2)+"\t"+vrs.getLong(3)+"\t"+vrs.getLong(4));
				}
				
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
