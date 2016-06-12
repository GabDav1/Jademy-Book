package week3OOP3;

public class Cover extends Page {
	
	private int yearOfLaunch;
	private boolean isHardCover;
	
	// getters setters
	
	public int getYearOfLaunch() {
		return yearOfLaunch;
	}



	public void setYearOfLaunch(int yearOfLaunch) {
		this.yearOfLaunch = yearOfLaunch;
	}



	public boolean isHardCover() {
		return isHardCover;
	}



	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}

	//constructors
	
	public Cover(int page, String content, int year, boolean hard){
		super(page,content);
		this.setYearOfLaunch(year);
		this.setHardCover(hard);
		
	}
	
	public Cover(String content, int year, boolean hard){
		super(1,content);
		this.setYearOfLaunch(year);
		this.setHardCover(hard);
		
	}
	
	public Cover(int year){
		this("blank",year,false);
	}
	
	public Cover(String content){
		this(content,2020,false);
	}
	
	public Cover(){
		this(2020);
	}

	//methods

	public String toString(){
		StringBuilder nou = new StringBuilder("");
		nou.append(super.toString()+"\n").append("anul aparitiei: ").append(this.getYearOfLaunch());
				
		String hardCover = (this.isHardCover())? "HardCover" : "PaperCover";
		nou.append("\n"+hardCover);
		
		
		return nou.toString();
	}

}
	

