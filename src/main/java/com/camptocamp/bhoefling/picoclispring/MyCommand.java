package com.camptocamp.bhoefling.picoclispring;

import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Component;

import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Component
public class MyCommand implements Callable<Integer> {

    @Option(names = "-x", description = "optional option")
    private String x;

    @Parameters(description = "positional params")
    private List<String> positionals;

    @Override
    public Integer call() {
        System.out.printf("mycommand was called with -x=%s and positionals: %s%n", x, positionals);
        return 23;
    }
}
