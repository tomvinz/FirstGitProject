package com.example.FirstJavaProject;
//import org.junit.Assert;
public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World, I am back.");
// The single checks for the example

        String grammar1 = "State\ta\tb\t!\n0\t5\t1\t5\n1\t2\t5\t5\n2\t3\t5\t5\n3\t3\t5\t4\n4:\t5\t5\t5\n5\t5\t5\t5";
        //State	a	b	!
        Automata automata=new Automata(grammar1);
        automata.acceptsString("baa!");
        ExtendedAutomata ea=new ExtendedAutomata(grammar1);
          ea.findMatches("baa! He said baaaa! babaa!! baaaa!");
       // checkAutomata(grammar1, "baa!", true);
        //checkAutomata(grammar1, "baaa!", true);
        //checkAutomata(grammar1, "baaa!!!", false);
        //checkAutomata(grammar1, "!aab", false);
        //checkAutomata(grammar1, "xyz", false);
    }
//%maven org.junit.jupiter:junit-jupiter-api:5.3.1
//import org.junit.jupiter.api.Assertions;
//import org.opentest4j.AssertionFailedError;

    /**
     * A simple check whether an instance of the Automata class initialized with
     * the given grammar would accept the given input.
     */
  /*  public static void checkAutomata(String grammar, String input, boolean expectedResult) {
        try {
            com.example.FirstJavaProject.Automata automata = new Automata(grammar);
            if (expectedResult) {
                Assertions.assertTrue(automata.acceptsString(input),
                        "Your automata rejected \"" + input + "\" but it should have accepted it.");
            } else {
                Assertions.assertFalse(automata.acceptsString(input),
                        "Your automata accepted \"" + input + "\" but it should have rejected it.");
            }
            System.out.println("Test successfully completed.");
        } catch (AssertionFailedError e) {
            System.err.println(e);
            throw e;
        } catch (Throwable e) {
            System.err.println("Your solution caused an unexpected error:");
            throw e;
        }*/
    }




