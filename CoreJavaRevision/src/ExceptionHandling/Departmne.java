package ExceptionHandling;

public class Departmne {
	
	public static  int   details() throws NullPointerException{
		 
		 try{
			System.out.println("try called");
			 
			 return 12;
			 
		 }
		 catch(Exception e){
			 return 12;
		 }
		 
		 finally {
			System.out.println("finally");
			
			return 20;
		}
		
	}
	
 public static void main(String[] args) {
	 Departmne d= new Departmne();
	System.out.println(d.details());
	
	
}

}
