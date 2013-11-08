public class EkspresiWajah {
	public String respons() {
		return("Perhatikan ekspresi wajah saya");
		}
	}
	class Gembira extends EkspresiWajah {
		public String respons() {
		return("WK WK WK WK. . . . .");
		}	
	}
	class Sedih extends EkspresiWajah {
		public String respons() {
		return("Hiks.. huu :(");
		}	
	}
	class Marah extends EkspresiWajah {
		public String respons() {
		return("KURANG AJAR!!!!");
		}	
	}