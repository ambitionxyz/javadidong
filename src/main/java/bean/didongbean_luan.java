package bean;

public class didongbean_luan {
	private int Madidong;
	private String tendidong;
	private String nhacungcap;
	private int gia;
	private int soluong;
	private	String anh;
	public didongbean_luan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public didongbean_luan(int madidong, String tendidong, String nhacungcap, int gia, int soluong, String anh) {
		super();
		Madidong = madidong;
		this.tendidong = tendidong;
		this.nhacungcap = nhacungcap;
		this.gia = gia;
		this.soluong = soluong;
		this.anh = anh;
	}
	public int getMadidong() {
		return Madidong;
	}
	public void setMadidong(int madidong) {
		Madidong = madidong;
	}
	public String getTendidong() {
		return tendidong;
	}
	public void setTendidong(String tendidong) {
		this.tendidong = tendidong;
	}
	public String getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
	
	
	
	
}
