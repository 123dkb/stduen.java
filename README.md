# stduen.java
*这期所要学习的内容是对象和继承，任务是做一个通过对象和继承做一个选课系统<br>
*继承的关键字是"EXTENDS"我把people设定成父类 并且设定了关于people的属性，属性有名字，性别，学号，课程号；<br>
*例如：	static String number;<br>
		static String name;<br>
		static String sex;<br>
		public people(String number,String name,String sex) {<br><br><br><br>
			this.number=number;<br><br><br>
			this.name=name;<br><br>
			this.sex=sex;・・・<br>
*子类和父类在一个同一个包中，子类继承父类中不是private的成员变量，继承的成员变量或方法的访问权限保持不变<br>
*子类必须通过关键字super关键字来继承父类的构造函数，子类默认继承父类的无参数的构造函数<br>
*因为我再people父类中构造了三个带有参数的构造函数所以我再后面的子类中必须加入关键字super才可以正常编辑；<br>
*例如：public class student extends people{
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
		
}・・・
例如：class teacher extends people{
	public teacher(String number, String name, String sex) {
		super(number, name, sex);
	}
	public teacher() {
		super(number, name, sex);
	}  ；
  *使用对象数组的方法：
  例如：Student [] stu;
  stu = new Student[10]
  所以我要再couser 类创建：
  例如：String [] a= {"java","java web","ps"};
  *选课的course的类中出去基础的信息属性，我需要把学生的选择的课程号，地点，时间加入进去。这时需要通过一个if else语句来实现
  例如：public void xuanke(String name){
		student student=new student();
		student.getName();
		student.setNumber("2020322105");
		student.setName("dam");
		String bh;
		bh=student.getNumber();
	    if(student.getNumber()=="2020322105") {
	    	arress=301;time="8:00";
	    	System.out.println("学生姓名："+student.getName());
	    	System.out.println("学生选择的课程 ："+a[0]);
	    	System.out.println("上课地点："+arress+"教室");
	    	System.out.println("上课时间："+time);
	    	
	    }else  {
	    	System.out.println("你输入的课程有误");
	    }
	}・・・
  最后我们需要把所有汇总，再test类中创建主函数以保证这个包的实现『选课系统』:
  例如：
  public class test {
	public static void main(String[] args) {
		student a = new student();
		teacher b = new teacher();
		course0 c= new course0();
		
		String mName = a.getName();
		String mNumber = a.getNumber();
		String mSex = a.getSex();
		a.setNumber("2020322102");
		a.setName("dam33");
		a.setSex("sile");
     	mName = a.getName();
		mNumber = a.getNumber();
		mSex = a.getSex();
		String teachernumber=b.getNumber();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
    System.out.println("学生选课系统");
		System.out.println("Serial number is : " + mNumber);
		System.out.println("Name is : " + mName);
		System.out.println("sex is :" + mSex);
		a.setClasss("java");・・・
    这次的任务是希望通过『选课系统』了解学习类与对象 和 子类的继承 通过课本同学网上的教程进一步的学习掌握这一周所学内容。对于这次实际操作我对于子类与继承有了一个比较基础的了解。也有不少失误，对于对象的重写了解较少会重新学习掌握；
