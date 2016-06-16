package experiments;

class ToDos{
	String day;
	
	public ToDos(String d) { 
		day = d; 
	}
	public boolean equals(Object o) {
		return ((ToDos)o).day == this.day;
	}
	// public int hashCode() { return 9; }
}
