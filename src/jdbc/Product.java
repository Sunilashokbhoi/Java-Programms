package jdbc;
import java.util.*;
import java.sql.*;
public class Product {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try(sc;){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","sunil","sunil");
			Statement stm = con.createStatement();
			while(true) {
			System.out.println("Choice Operation ");
			System.out.println("1)AddProduct\n2)ViewAllProducts\n3)ViewProductByCode\n4)UpdateProductByCode(Price-Qty)\n5)DeleteProductById\n6)Exit\n");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
				System.out.println("Add Product");
				System.out.println("Enter Code");
				int code = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Price:");
				int price = sc.nextInt();
				System.out.println("Enter QTY");
				int qty = sc.nextInt();
				
				int k =stm.executeUpdate("insert into product72 values("+code+",'"+name+"',"+price+","+qty+")");
				if(k>0) {
					System.out.println("Product Added Succsessfully...");
				}}
				catch(InputMismatchException me) {
					System.out.println("Mis MAtch Exception");
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
				}else {
					System.out.println("Product is Not Available ...");
				}
				break;
			case 4:
				System.out.println("Enter Product code For update ");
				int pcode = sc.nextInt();
				System.out.println("Enter New Price ");
				int nprice = sc.nextInt();
				System.out.println("Enter New Qty");
				int nqty = sc.nextInt();
				int upd = stm.executeUpdate("update product72 set price="+nprice+", qty="+nqty+" where code="+pcode+"");
				if(upd>0) {
				System.out.println("Producr updatetd");
			}else {
				System.out.println("Not Update");
			}
			break;
			case 5:
				System.out.println("Enter Code For Delete Data");
				int dcode = sc.nextInt();
				int d= stm.executeUpdate("delete from product72 where code="+dcode);
				if(d>0) {
					System.out.println("Product is deleted ..");
				}else {
					System.out.println("Product Record is Not Available ");
				}
				break;
			case 6:
				System.out.println("Program Ended");
				System.exit(0);
				default :
					System.out.println("Invalid Input choice ");
			}
			System.out.println("**************");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
