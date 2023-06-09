package io.knifer.demo;

import org.graalvm.polyglot.Context;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * @author Knifer
 * @version 1.0.0
 */
public class MainTest {

    private static final Logger logger = LoggerFactory.getLogger(MainTest.class);

    @Test
    void test(){
        info("Graalvm Study Demo Test");
        try (Context context = Context.create()){
            context.eval(
                    "js",
                    "console.log('------TEST START------\\nHello graalvm !\\n------TEST END------')"
            );
        }
    }

    private void info(Object info){
        logger.info(info::toString);
    }
}
