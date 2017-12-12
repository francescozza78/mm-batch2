package com.mediamarket.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "ean_record")
public class EnrichedEan {
	
	String attivo ; 
	String codiceEan ; 
	String codiceEanEnriched ; 
	String eanSkidArticolo ;
	
	
	@XmlElement(name="attivo")
	public String getAttivo() {
		return attivo;
	}
	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}
	
	@XmlElement(name="codiceEan")
	public String getCodiceEan() {
		return codiceEan;
	}
	public void setCodiceEan(String ean) {
		this.codiceEan = ean;
	}
	
	@XmlElement(name="eanSkidArticolo")
	
	public String getEanSkidArticolo() {
		return eanSkidArticolo;
	}
	public void setEanSkidArticolo(String ean_skid_articolo) {
		this.eanSkidArticolo = ean_skid_articolo;
	}
	
	@XmlElement(name="codiceEanEnriched")
	public String getCodiceEanEnriched() {
		return codiceEanEnriched;
	}
	public void setCodiceEanEnriched(String codiceEanEnriched) {
		this.codiceEanEnriched = codiceEanEnriched;
	}

}
