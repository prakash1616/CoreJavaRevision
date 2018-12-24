package beans;

public class Employee {

	private int id;
	private Adress adress;

	public Employee(int id, Adress adress) {
		super();
		this.id = id;
		this.adress = adress;
	}

	public void getId() {
		System.out.println(id);
	}

	public void setAdress(Adress adress) {
		System.out.println("set adress called ");
	}

}
