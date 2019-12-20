package edu.drools.example;

import java.io.IOException;
import java.util.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.swing.*;

public class Main{

    public static void main(String[] args) throws DroolsParserException, IOException {
        Main main = new Main();

        main.executeHelloWorldRules();

        Window window = new Window();
        boolean again = window.askTrueFalse("Do you want to start again?");
        while(again)
        {
            main.executeHelloWorldRules();
            again = window.askTrueFalse("Do you want to start again?");
        }
    }

    public void executeHelloWorldRules() throws IOException, DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(Main.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");

        session.fireAllRules();
    }
}

