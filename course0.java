package package0;



class course0  {
	String Name;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	int arress;
	String time;
	String number;
	String palce;
	String teacher;
	String [] a= {"java","java web","ps"};
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public void xuanke(String name){
		student student=new student();
		student.getName();
		student.setNumber("2020322081");
		student.setName("阿斌");
		String bh;
		bh=student.getNumber();
	    if(student.getNumber()=="2020322081") {
	    	arress=301;time="8:00";
	    	System.out.println("学生姓名："+student.getName());
	    	System.out.println("学生选择的课程 ："+a[0]);
	    	System.out.println("上课地点："+arress+"教室");
	    	System.out.println("上课时间："+time);
	    	
	    }else  {
	    	System.out.println("你输入的课程有误");
	    }
	}
	public void duike(String name) {
		student student=new student();
		student.getName();
		student.setNumber("2020322081");
		student.setName("阿斌");
		String bh;
		bh=student.getNumber();
		if(student.getNumber()=="2020322081") {
			System.out.println("学生姓名："+student.getName());
			System.out.println("你已经退课了，其重新选课");
		}
	}
	}
