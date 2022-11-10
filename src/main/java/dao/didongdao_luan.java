package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.didongbean_luan;

public class didongdao_luan {
	public ArrayList<didongbean_luan> getdidong() {
		ArrayList<didongbean_luan> ds = new ArrayList<didongbean_luan>();
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = "select * from DIdong";
			PreparedStatement cmd  = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while(rs.next()) {
				int Madidong = rs.getInt("Madidong");
				String nhacungcap = rs.getString("nhacungcap");
				String tendidong = rs.getString("tendidong");
				int soluong = rs.getInt("soluong");
				String anh = rs.getString("anh");
				int gia = rs.getInt("gia");
				ds.add(new didongbean_luan(Madidong, tendidong, nhacungcap, gia, soluong, anh));
			}
			rs.close();
			kn.cn.close();
			return ds;
		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}
		
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		didongdao_luan dddao = new didongdao_luan();
//		ArrayList<didongbean_luan> ds1;
//		ds1 = dddao.getdidong();
//		
//		try {
//			for(didongbean_luan dd: ds1) {
//				System.out.println("ma di dong: "+ dd.getMadidong());
//				System.out.println("nha cung cap:" +dd.getNhacungcap());
//				System.out.println("so luong: " + dd.getSoluong());
//				System.out.println("anh: " + dd.getAnh());
//				System.out.println("gia: " + dd.getGia());
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
