package ispravka_koda;

public class FibonaciNiz {

		public static boolean proveriNiz(int[] niz) {
			
			if(niz==null || niz.length<3 || niz[0]!=0 || niz[1]!=1) {
				return false;
			}
			for(int i=0;i<niz.length-3;i=i+3) {
				if(niz[i+2]!=niz[i+1]+niz[i]) return false;
			}
			
			return true;
			
			//ORIGINALNI KOD:
			/*if(niz==null || niz.length<3 || niz[0]!=0 || niz[1]!=0) {
				return false;
			}
			for(int i=0;i<niz.length-1;i=i+3) {
				if(niz[i+2]!=niz[i+1]+niz[i]) return false;
			}
			
			return true;*/
		}
	
}
