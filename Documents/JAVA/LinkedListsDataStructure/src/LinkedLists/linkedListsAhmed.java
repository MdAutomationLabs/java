package LinkedLists;


public class linkedListsAhmed {

	public static void main(String[] args) {
		//Md Ahmed
		linkedLists list = new linkedLists();// list object
		can can1 = new can("S&W", "Peaches", 12.0, 2.3);
		can can2 = new can( 12.44, 2.2);
		can can3 = new can("Del Monte", "Creamed Corn", 12.31, 1.4);
		can can4 = new can("Garber", "multi grain");
		// inserted more value in can
		can4.setPrice(2.48);
		can4.setSize(5.9);
		can2.setCompany("green Gain");
		can2.setContent("Green Beans");
		// all can are printed 
		System.out.println("Can 1 "+can1.toString());
		System.out.println("Can 2 "+can2.toString());
		System.out.println("Can 3 "+can3.toString());
		System.out.println("Can 4 "+can4.toString());
		// all can are inserted in list
		list.insert(can1);
		list.insert(can2);
		list.insert(can3);
		list.insert(can4);
		list.printList();
		System.out.println("Removed: "+list.remove());
		System.out.println("Removed: "+list.remove());
		list.printList();
		System.out.println("Top: "+list.top());
		System.out.println("isEmpty: "+list.isEmpty());
		System.out.println("Size: : "+list.size());
		
	}

}
