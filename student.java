package package0;

public class student extends people{
		public student(String number, String name, String sex) {
			super(number, name, sex);	
		}
		public student() {
			super(number, name, sex);
		}
	    String classs;
		public String getClasss() {
			return classs;
		}

		public void setClasss(String classs) {
			this.classs = classs;
		}
		
}
