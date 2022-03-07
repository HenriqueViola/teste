module Porta {
	
	public class Door {
		
		private String state; 
		private String name;
		
		
		
		public Door() {
			
			state = "open";
			name = "front";
			
		}
		
		
		
		public Door(String newName, String newState) {
			
			state = newState;
			name = newName;
			
		}
		
		
		
		public void open() {
			
			state = "open";
			
		}
		
		
		
		public void close() {
			
			state = "closed";
			
		}
		
		
		
		public String getName() {
			
			return name;
			
		}
		
		
		public String getState() {
			
			return state;
			
		}
		
		
		public void setName (String newName) {
			
			name = newName;
			
		}
		
		
		public void setState (String newState) {
			
			state = newState;
			
		}

	}
}