package Krediti;

import java.util.GregorianCalendar;

import Krediti.Izuzeci.KreditiException;
import Krediti.Nekretnine.TipStambenogObjekta;

public class StambeniKredit {

	public static final int MAX_PERIOD_OTPLATE=25;
	private TipStambenogObjekta tipObjekta;
	private double kvadratura;
	private int periodOtplate;
	private GregorianCalendar datumPocetkaOtplate;
	private double iznosKredita;
	
	
	
	public TipStambenogObjekta getTipObjekta() {
		return tipObjekta;
	}



	public void setTipObjekta(TipStambenogObjekta tipObjekta) {
		this.tipObjekta = tipObjekta;
	}



	public double getKvadratura() {
		return kvadratura;
	}



	public void setKvadratura(double kvadratura) throws KreditiException {
		if(kvadratura>4 && kvadratura<1000)
		{
			this.kvadratura = kvadratura;
		}
		else
		{
			throw new KreditiException("Kvadratura mora biti izmedju 4 i 1000");
		}
	}



	public int getPeriodOtplate() {
		return periodOtplate;
	}



	public void setPeriodOtplate(int periodOtplate) throws KreditiException {
		if(periodOtplate>=1 && periodOtplate<MAX_PERIOD_OTPLATE)
		{
			this.periodOtplate = periodOtplate;
		}
		else
		{
			throw new KreditiException("Period otplate mora biti izmedju 1 i "+MAX_PERIOD_OTPLATE + " god.");
		}
		
	}



	public GregorianCalendar getDatumPocetkaOtplate() {
		return datumPocetkaOtplate;
	}



	public void setDatumPocetkaOtplate(GregorianCalendar datumPocetkaOtplate) throws KreditiException {
		if(datumPocetkaOtplate==null)
		{
			throw new KreditiException("Datum pocetka otplate ne sme biti NULL!");
		}
		else
		{
			GregorianCalendar datum = new GregorianCalendar(1990,0,1);
			GregorianCalendar danas = new GregorianCalendar();
			if(datumPocetkaOtplate.after(datum) && datumPocetkaOtplate.before(danas))
			{
				this.datumPocetkaOtplate = datumPocetkaOtplate;
			}
			else
			{
				throw new KreditiException("Datum pocetka otplate mora biti trenutak u proslosti posle 1.1.1990.");
			
			}
		}
	}


	public double getIznosKredita() {
		return iznosKredita;
	}



	public void setIznosKredita(double iznosKredita) throws KreditiException {
		if(iznosKredita > 1000 && iznosKredita < 2500000)
		{
			this.iznosKredita = iznosKredita;
		}
		else
		{
			throw new KreditiException("Iznos kredita mora biti veci od 1000 a manji od 2500000");
		}
	}



	public StambeniKredit() {
		
	}



	@Override
	public boolean equals(Object obj) {
		StambeniKredit temp = (StambeniKredit)obj;
		if(temp.getTipObjekta()==this.tipObjekta && temp.getKvadratura()==this.kvadratura && temp.getIznosKredita()==this.iznosKredita && temp.getDatumPocetkaOtplate().equals(this.datumPocetkaOtplate)) {
			return true;
		}
		return false;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tip Objekta: " + this.tipObjekta.name()+"Period otplate: "+this.periodOtplate+" Iznos kredita: "+this.iznosKredita+" Kvadratura: "+this.kvadratura+" Datum pocetka otplate: "+this.datumPocetkaOtplate.toString();
	}



	public StambeniKredit(TipStambenogObjekta tipObjekta, double kvadratura, int periodOtplate,
			GregorianCalendar datumPocetkaOtplate, double iznosKredita) {
		super();
		this.tipObjekta = tipObjekta;
		this.kvadratura = kvadratura;
		this.periodOtplate = periodOtplate;
		this.datumPocetkaOtplate = datumPocetkaOtplate;
		this.iznosKredita = iznosKredita;
	}
	
}
