
public class AddressTester {

	public static void main(String[] args) {
		// Md Ahmed
		Address home = new Address("123","Main Street","Des Moines", "IA","50321");
		home.print();
		
		System.out.println("----------------");
		
		Address condo = new Address("5643", "Hideaway Mountain", "3C","Nashville", "TN", "37115");
		condo.print();

	}

}
