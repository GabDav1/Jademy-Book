package week3OOP3;
import java.util.Scanner;
public class Book {
	
	private Cover frontCover;
	private Cover backCover;
	private Page[] pagini;
	private String publisher;
	private String autor;
	
	
	//getters and setters
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Cover getFrontCover() {
		return frontCover;
	}
	public void setFrontCover(Cover frontCover) {
		this.frontCover = frontCover;
	}
	public Cover getBackCover() {
		return backCover;
	}
	public void setBackCover(Cover backCover) {
		this.backCover = backCover;
	}
	
	public Page[] getPagini() {
		return pagini;
	}
	public void setPagini(Page[] pagini) {
		this.pagini = pagini;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

	// constructors
	public Book(Cover front, Cover back, Page[] pag, String pub, String autor){
		this.setFrontCover(front);
		this.setBackCover(back);
		this.setPagini(pag);
		this.setPublisher(pub);
		this.setAutor(autor);
		
	}
	
	public Book(Cover front, Cover back, Page[] pag){
		this(front, back, pag,"blank publisher","blank author");
	}
	
	public Book(){
		this(new Cover(),new Cover(1), new Page[1]);
	}
	
	
	// methods
	
	public void addContentToPage(int pageNo){
		int temp = 0;
		Scanner tst = new Scanner(System.in);
		String mm ;
		StringBuilder content = new StringBuilder();
		
		
		while(true){
			mm = tst.nextLine();
			content.append(" "+mm + "\n ");
			if(mm.isEmpty()){
				break;	
			}
			
		}
		this.pagini[pageNo].setContent(this.pagini[pageNo].getContent()+content);
	}
	
	public String toString(){
		
		StringBuilder toataCartea = new StringBuilder(this.getFrontCover().toString()+"\n");
		
		for(int i = 0; i<this.pagini.length; i++){
			
			if(this.pagini[i]==null){
				
				toataCartea.append("\npagina lipsa"+"\n");
				
			} else {
				this.pagini[i].setPageNo(i+2);
				toataCartea.append("\n"+this.pagini[i]+"\n");
				
			}
		
		}
		this.backCover.setPageNo(this.pagini.length);
		toataCartea.append("\n"+ this.backCover);
		return toataCartea.toString();
	}
	
}

