package demoThuaKe;

public abstract class HinhHoc {
		protected String tenHinh;
		
		public String getTenHinh() {
				return tenHinh;
		}
		public void setTenHinh(String tenHinh) {
			this.tenHinh= tenHinh;
		}
		public HinhHoc(String tenHinh) {
			this.tenHinh = tenHinh;
		}
		public abstract double getDienTich();
		public HinhHoc() {}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		
}