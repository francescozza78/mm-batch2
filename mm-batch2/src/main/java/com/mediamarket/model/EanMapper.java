package com.mediamarket.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EanMapper implements RowMapper<Ean> {
	
	String codiceEan ;
	String eanSkidArticolo ;
	String attivo ; 


    public Ean mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ean ean = new Ean();

        ean.setCodiceEan(rs.getString(codiceEan));
        ean.setEanSkidArticolo(rs.getString(eanSkidArticolo));
        return ean;
    }


	public String getCodiceEan() {
		return codiceEan;
	}


	public void setCodiceEan(String codiceEan) {
		this.codiceEan = codiceEan;
	}


	public String getEanSkidArticolo() {
		return eanSkidArticolo;
	}


	public void setEanSkidArticolo(String eanSkidArticolo) {
		this.eanSkidArticolo = eanSkidArticolo;
	}


	public String getAttivo() {
		return attivo;
	}


	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}
}

