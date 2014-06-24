package by.bsu.yakovlev.biker.main;

import by.bsu.yakovlev.biker.bikercreator.Control;
import org.apache.log4j.Logger;

class BikerMain {

    private static final Logger LOGGER = Logger.getLogger(BikerMain.class);

    public static void main(String[] args) {

       LOGGER.info(Control.TestControl(2));
    }
}

