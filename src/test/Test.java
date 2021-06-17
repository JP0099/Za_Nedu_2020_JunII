package test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import Krediti.Banka;
import Krediti.StambeniKredit;
import Krediti.Izuzeci.KreditiException;
import Krediti.Nekretnine.TipStambenogObjekta;
import ispravka_koda.FibonaciNiz;

public class Test {

	public static void main(String[] args) throws KreditiException {
		// TODO Auto-generated method stub
		/*StambeniKredit k = new StambeniKredit();
		GregorianCalendar g_test2020 = new GregorianCalendar(1,0,2020);
		GregorianCalendar g_test2020_2 = new GregorianCalendar(2,0,2020);
		GregorianCalendar g_test2019 = new GregorianCalendar(1,0,2019);
		GregorianCalendar g_test2018 = new GregorianCalendar(1,0,2018);
		GregorianCalendar g_test2017 = new GregorianCalendar(1,0,2017);
		
		List<StambeniKredit> kk = new ArrayList();
		kk.add(new StambeniKredit(TipStambenogObjekta.KUCA,6000,3,g_test2020_2,200000));
		kk.add(new StambeniKredit(TipStambenogObjekta.STAN,6000,2,g_test2020,200000));
		kk.add(new StambeniKredit(TipStambenogObjekta.STAN,6000,4,g_test2017,200000));
		kk.add(new StambeniKredit(TipStambenogObjekta.VIKENDICA,6000,4,g_test2017,200000));
		Banka b = new Banka(kk);
		b.dodajKredit(new StambeniKredit(TipStambenogObjekta.STAN,6010,2,g_test2018,200000));
		System.out.println("Test!");*/
		
		int[] test = {0,1,1,2,3,5,8,13,21,34,55};
		int[] test_neg = {0,1,2,3,4,5,6,7,8};
		FibonaciNiz fn = new FibonaciNiz();
		System.out.println("test: "+fn.proveriNiz(test) + "\ntest_neg:"+fn.proveriNiz(test_neg));
		
	}
	

}
