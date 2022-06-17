package com.camptocamp.bhoefling.picoclispring;

import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Component;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Component
//@Command(name = "mycommand", mixinStandardHelpOptions = true, subcommands = MyCommand.Sub.class)
@Command(name = "report", mixinStandardHelpOptions = true)
public class MyCommand implements Callable<Integer> {

    @Option(names = { "-u", "--user" }, description = "User", required = true)
    private String user;

    @Option(names = { "-m", "--message" }, description = "Message")
    private String message;

    @Parameters(description = "positional params")
    private List<String> positionals;

    @Override
    public Integer call() {
	System.out.println("Hello, World!");
        System.out.printf("report was called with -u=%s and -m=%s and positionals: %s%n", user, message, positionals);
        return 23-23+23;
    }
}
