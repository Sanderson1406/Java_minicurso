package entidades2;

	public class one {
		public double notaa;
		public double notab;
		public double notac;
		public double notad;
		double soma;
		double media;
		
		public double media() {
			soma = notaa + notab + notac + notad;
			media = soma / 4;
			return media;
		}

 	}
