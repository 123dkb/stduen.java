package package0;


public class test {
	public static void main(String[] args) {
		student a = new student();
		teacher b = new teacher();
		course0 c= new course0();
		
		String mName = a.getName();
		String mNumber = a.getNumber();
		String mSex = a.getSex();
		a.setNumber("2020322102");
		a.setName("kongdeyin");
		a.setSex("male");
     	mName = a.getName();
		mNumber = a.getNumber();
		mSex = a.getSex();
		String teachernumber=b.getNumber();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
		b.setNumber("001");
		b.setName("李四");
		b.setInstruction("java授课老师");
		teachername = b.getName();
		teachernumber=b.getNumber();
		teacherclass=b.getInstruction();
		String course0number =c.getNumber();
		String course0name =c.getName();
		String course0place =c.getPalce();
		String course0teacher=c.getTeacher();
		c.setNumber("1");
		c.setName("Java");
		c.setPalce("综合一教3-206");
		c.setTeacher("李四");
		course0number =c.getNumber();
		course0name =c.getName();
		course0place =c.getPalce();
		course0teacher=c.getTeacher();
		System.out.println("学生选课系统");
		System.out.println("Serial number is : " + mNumber);
		System.out.println("Name is : " + mName);
		System.out.println("sex is :" + mSex);
		a.setClasss("java");
		String mClass = a.getClasss();
		System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teachernumber);
		System.out.println("lecture teacher is ："+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course number :"+course0number);
		System.out.println("Course title :"+course0name);
		System.out.println("Course plance :"+course0place);
		
	
       
	}
}
