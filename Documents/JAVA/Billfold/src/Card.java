

public class Card {
	// Md Ahmed
	   private String name;

	   protected Card()
	   {
	      name = "";
	   }

	   protected Card(String n)
	   {
	      name = n;
	   }

	   public String getName()
	   {
	      return name;
	   }

	   public boolean isExpired()
	   {
	      return false;
	   }

	   public String format()
	   {
	      return "Card holder: " + name;
	   }
    public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
     }

