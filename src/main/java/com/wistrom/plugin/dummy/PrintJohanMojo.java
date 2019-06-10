package com.wistrom.plugin.dummy;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "printJohan")
public class PrintJohanMojo extends AbstractMojo {

    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(ANSI_RED_BACKGROUND + ANSI_WHITE + "---------I AM NOW PRINTING JOHAN---------" + ANSI_RESET);
    }
}
