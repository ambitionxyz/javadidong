package bo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.tomcat.util.codec.binary.StringUtils;

import bean.didongbean_luan;
import dao.didongdao_luan;

public class didongbo_luan {
	
	didongdao_luan dddao = new didongdao_luan();
	ArrayList<didongbean_luan> ds;
	public ArrayList<didongbean_luan> getList() {
		return ds = dddao.getdidong();
	}
	
	
	public ArrayList<didongbean_luan> timkiem(String key) {
		boolean checkKeyIsNum = false;
		ArrayList<didongbean_luan> tk = new ArrayList<didongbean_luan>();
		try {  
			Integer.parseInt(key.trim());  
		    checkKeyIsNum = true;
		  } catch(NumberFormatException e){  
			  checkKeyIsNum =  false;  
		  }  
		
		if(ds != null) {
			if(checkKeyIsNum) {
				for(didongbean_luan dd : ds) {
					if(dd.getGia() >= Integer.parseInt(key)) {
						tk.add(dd);
					}
				}
			} else {
				for(didongbean_luan dd: ds) {
					if (dd.getNhacungcap().toLowerCase().trim().contains(key.toLowerCase().trim())) {
						tk.add(dd);
					}
				}
			}
		}
		
		return tk;
	}
	
	public ArrayList<didongbean_luan> phantrang(int sotrang, int trangthu) {
		ArrayList<didongbean_luan> tam = new ArrayList<didongbean_luan>();
		try {
			int startCount = 1;
			int endCount = sotrang;
			if(trangthu > 1) {
				startCount *= sotrang;;
				endCount = startCount + sotrang;
			}
			if(ds!= null && endCount > ds.size()) {
				endCount = ds.size()+1;
			}
			for(int i = startCount -1; i< endCount; i++) {
				tam.add(ds.get(i));
			}
			return tam;
			
			
		} catch (Exception e) {
			return ds;
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		didongbo_luan a = new didongbo_luan();
		ArrayList<didongbean_luan> ds2 = new ArrayList<didongbean_luan>();
		ds2 = a.timkiem("300000");
		for(didongbean_luan d : ds2) {
			System.out.println(d.getNhacungcap());
		}

	}

}
