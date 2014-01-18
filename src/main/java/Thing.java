package mpr.lect.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thing {

	final Logger log = LoggerFactory.getLogger(Thing.class);

	public String hi(String name) {
		log.debug("Argument name: '" + name + "'");
		return "Hi - it's me, " + name;
	}
}