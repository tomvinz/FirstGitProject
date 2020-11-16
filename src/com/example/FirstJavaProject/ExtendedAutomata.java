package com.example.FirstJavaProject;

public class ExtendedAutomata extends Automata {

    // YOUR CODE HERE

    public ExtendedAutomata(String grammarDef) {
        super(grammarDef);
    }

    /**
     * Searches for all matchings of the grammar from the given text.
     */
    public String[] findMatches(String text) {
        String[] matches = new String[5];
        int count=0;
        // YOUR CODE HERE
        int j=0;
        int i=0;
        String[] newrow=text.split(" ");
        while(i<newrow.length){

            //int r1 = 0;
            //for (String row : rows) {
              //  tmatrix[r]= row.split("\\t");
            //System.out.println(newrow[i]);
            if(acceptsString(newrow[i])){
                matches[j]=newrow[i];
                j++;
                count++;
            }
            System.out.println("Count is"+count) ;

            i++;

        }
        for(int k=0;k<matches.length;k++)
        System.out.println(matches[k]);
        return matches;
    }
}
