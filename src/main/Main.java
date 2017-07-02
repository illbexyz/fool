package main;

import org.antlr.v4.runtime.CharStreams;
import org.apache.commons.cli.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Options options = new Options();
        options.addRequiredOption("i", "input", true, "input .fool file");
        options.addOption("d", "debug", false, "show debug logs");
        options.addOption("a", "ast", false, "show the AST");
        options.addOption("s", "svm", true, "outputs the generated SVM code to the given file");
        options.addOption("b", "bytecode", true, "outputs the generated Bytecode to the given file");
        options.addOption("t", "test", false, "the input file is treatead as a .yml test suite file");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine line = parser.parse(options, args);

            String inputFilename = line.getOptionValue("input");
            String svmFilename = inputFilename.substring(0, inputFilename.lastIndexOf(".")) + ".svm";
            String bytecodeFilename = "";

            if (line.hasOption("svm")) {
                svmFilename = line.getOptionValue("svm");
            }

            if (line.hasOption("bytecode")) {
                bytecodeFilename = line.getOptionValue("bytecode");
            }

            if (line.hasOption("test")) {
                TestComplete.runTestSuite(line.getOptionValue("test"));
            } else {
                FoolRunner.run(
                        CharStreams.fromFileName(inputFilename),
                        svmFilename,
                        bytecodeFilename,
                        line.hasOption("bytecode"),
                        line.hasOption("debug"),
                        line.hasOption("ast")
                );
            }
        } catch (ParseException e) {
            System.err.println("Parsing failed: " + e.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("fool", options);
        }
    }

}