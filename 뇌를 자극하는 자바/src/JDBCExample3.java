// ��Ű��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample3 {
    public static void main(String args[]) {
    	// 1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
    	Connection conn = null;
    	// Statement �������̽� - SQL ����.
    	Statement stmt = null;
    	// ResultSet �������̽� - SQL ����� ����
    	ResultSet rs = null;
    	// try ~ catch ������ DB���� �߿� ���ܰ� �߻��ϴ����� �˻�.
    	try {
        	// 2�ܰ� : JDBC����̹��� �ε��Ѵ�.
            Class.forName("com.mysql.jdbc.Driver");
            // 3�ܰ� : ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
            System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
            
            // Ŀ�ؼ� ��ü�� Statement ��ü�� ����
            stmt = conn.createStatement();
            
            // DML SQL ���� ���� �� ����� ����
            rs = stmt.executeQuery("select goodsInfoCode, goodsInfoName, price, maker from goodsinfo;");
            
            System.out.println("��ǰ�ڵ�           ��ǰ��             ����            ������");
            
            while(rs.next()) {
            
            	String goodsInfoCode  = rs.getString(1);//rs.getString("goodsInfoCode");
            	String goodsInfoName  = rs.getString(2);//rs.getString("goodsInfoName");
            	int price             = rs.getInt(3);//rs.getString("price");
            	String maker            = rs.getString(4);   //rs.getInt("maker");
            	System.out.println(goodsInfoCode + "---" + goodsInfoName +  "---" + price +  "---" + maker);
            
            }
            rs = stmt.executeQuery("select cname, address, phoneno from custinfo;");
            
            System.out.println(" �̸�                                        �ּ�                            ��ȭ��ȣ");
            
            while(rs.next()) {
            	String cname  = rs.getString(1);//rs.getString("goodsInfoCode");
            	String address  = rs.getString(2);//rs.getString("goodsInfoCode");
            	String phoneno  = rs.getString(3);//rs.getString("goodsInfoCode");
            	System.out.println(cname + "---" + address +  "---" + phoneno);
            }
            
            // 4�ܰ� : DB������ �����Ѵ�.
            conn.close();
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}    
