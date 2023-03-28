package tokoHOLO;


public class User {
		private String clerkID;
		private String clerkName;
		private String username;
		private String password;
		private String useRole;
		
		public User(String clerkID, String clerkName, String username, String password, String useRole) {
			super();
			this.clerkID = clerkID;
			this.clerkName = clerkName;
			this.username = username;
			this.password = password;
			this.useRole = useRole;
		}
		
		public String getClerkID() {
			return clerkID;
		}
		public void setClerkID(String clerkID) {
			this.clerkID = clerkID;
		}
		public String getClerkName() {
			return clerkName;
		}
		public void setClerkName(String clerkName) {
			this.clerkName = clerkName;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String usernname) {
			this.username = usernname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUseRole() {
			return useRole;
		}
		public void setUseRole(String useRole) {
			this.useRole = useRole;
		}



}
