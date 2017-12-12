package com.mediamarket.processors;

import org.springframework.batch.item.ItemProcessor;

import com.mediamarket.model.Ean;
import com.mediamarket.model.EnrichedEan;

public class DoNothingProcessor implements ItemProcessor<EnrichedEan, EnrichedEan> {

	
	@Override
	public EnrichedEan process(EnrichedEan item) throws Exception {
	
		return item ;
	}


}