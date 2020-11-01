package package0;



class teacher extends people{
	public teacher(String number, String name, String sex) {
		super(number, name, sex);
	}
	public teacher() {
		super(number, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}