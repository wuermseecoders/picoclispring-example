package com.camptocamp.bhoefling.picoclispring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

import picocli.CommandLine;
import picocli.CommandLine.IFactory;

@Component
public class MyCmdRunner implements CommandLineRunner, ExitCodeGenerator {

    private final MyCommand myCommand;
    private final IFactory factory; // auto-configured to inject PicocliSpringFactory

    public MyCmdRunner(MyCommand myCommand, IFactory factory) {
        this.myCommand = myCommand;
        this.factory = factory;
    }

    private int exitCode;

    @Override
    public int getExitCode() {
        return exitCode;
    }

    @Override
    public void run(String... args) throws Exception {
        exitCode = new CommandLine(myCommand, factory).execute(args);
    }
}
