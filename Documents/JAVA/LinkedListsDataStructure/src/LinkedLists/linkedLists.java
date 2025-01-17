package LinkedLists;

public class linkedLists {
		private link head;
		private link tail;
		private int size;
 
		public linkedLists() {  // constructor 
			head = null;
			tail = null;
			size = 0;
		}

		// insert elements in list
		public void insert(can item) {
			link link = new link(item);
			if (head == null) {
				link.next = null;
				head = link;
				tail = link;
				size++;
			} else {
				tail.next = link;
				link.next = null;
				tail = link;
				size++;
				
			}

		}

		// remove elements form list
		public link remove() {
			link item = head;
			if (head == null) {
				head = null;
			}
			head = head.next;
			size--;
			return item;
		}
         
		public boolean isEmpty() {
			return head == null;
		}

		    // printing the items of the list
		public void printList() {
			link first = head;
			System.out.println("List: ");
			while (first != null) {
				first.print();
				first = first.next;
			}
			System.out.println(" ");
		}
		
		// top seeker
		public link top() {
			if (head != null) {
				return head;
			} else
				return null;
		} 
		// list size
		public int size() {
			return size;
			
		}
	}


	

