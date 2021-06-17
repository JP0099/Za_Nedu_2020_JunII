package Krediti;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import Krediti.Izuzeci.KreditiException;

public class Banka {

	private List<StambeniKredit> krediti;
	
	public Banka(List<StambeniKredit> k) {
		// TODO Auto-generated constructor stub
		if(k==null) {
			this.krediti = new ArrayList();
		}
		else
		{
			this.krediti = k;
		}
	}
	public Banka(StambeniKredit[] k)
	{
		if(k==null) {
			this.krediti = new ArrayList();
		}
		else if(k.length==0){
			this.krediti = new ArrayList();
		}
		else
		{
			this.krediti = new ArrayList();
			for(int i=0;i<k.length;i++) {
				krediti.add(k[i]);
			}
		}
	}
	
	public void dodajKredit(StambeniKredit el) throws KreditiException{
		for(int i=0;i<krediti.size();i++) {
			if(krediti.get(i).equals(el))
			{
				throw new KreditiException("Ne sme se dodati isti kredit!");
			}
		}
		boolean dodat = false;
		for(int i=0;i<krediti.size();i++) {
			if(krediti.get(i).getTipObjekta()==el.getTipObjekta())
			{
				krediti.add(i,el);
				dodat=true;
				break;
			}
		}
		if(dodat==false)
		{
			krediti.add(el);
		}
	}
	
	public void nadjiSkoroOtplacene() {
		GregorianCalendar danas = new GregorianCalendar();
		try {
		      FileWriter myWriter = new FileWriter("skoro_otplaceni.txt");
		      for(int i=0;i<krediti.size();i++) {
		    	  double razlika = (krediti.get(i).getDatumPocetkaOtplate().getTimeInMillis()-danas.getTimeInMillis()) / (1000*60*60*24*365);
		    	  if(razlika<1) {
		    		  myWriter.write(krediti.get(i).toString());
		    	  }
		      }
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Greska prilikom pisanja u fajl.");
		      e.printStackTrace();
		    }
	}

}
