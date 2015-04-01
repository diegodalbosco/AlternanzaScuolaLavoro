
package com.cadit.formazione.test;

import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author bellentani
 */
public class TestFormazione {
    
    private static final Logger LOG = Logger.getLogger(TestFormazione.class.getName());
    
    @Test
    public void testRandom() {
        Random random = new Random();
        int nextInt = random.nextInt(6);
        LOG.info("Estratto il: " + (nextInt + 1));
    }
    
}
