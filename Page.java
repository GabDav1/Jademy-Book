package week3OOP3;

public class Page {
	
	private int pageNo;
	private String content;
	
	
	// getters and setters
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	//constructors
	
	public Page(int pageNo, String content){
		this.setContent(content);
		this.setPageNo(pageNo);
		
	}
	
	public Page(int pageNo){
		this(pageNo, "blank");
	}
	
	public Page(){
		this(3);
	}
	
	//methods
	
	public String toString(){
		StringBuilder st = new StringBuilder("");
		
		st.append(this.getContent()).append("\n").append("- ").append(this.getPageNo()).append(" -");
		
		
		return st.toString();
	}

}
