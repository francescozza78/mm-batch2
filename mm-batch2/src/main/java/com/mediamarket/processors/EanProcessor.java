package com.mediamarket.processors;

import org.springframework.batch.item.ItemProcessor;

import com.mediamarket.model.Ean;
import com.mediamarket.model.EnrichedEan;

public class EanProcessor implements ItemProcessor<Ean, EnrichedEan> {

	
	@Override
	public EnrichedEan process(Ean item) throws Exception {
		EnrichedEan ee = new EnrichedEan();
		ee.setAttivo("N") ;
		ee.setCodiceEan(item.getCodiceEan()) ; 
		ee.setCodiceEanEnriched("@#"+item.getCodiceEan()) ; 
		ee.setEanSkidArticolo(item.getEanSkidArticolo());
		return ee ;
	}


}