package classes;

import interfaces.PreProcessor;

public class PreProcessorToLowerImpl implements PreProcessor {

	@Override
	public String process(String s) {
		return s.toLowerCase();
	}
}
