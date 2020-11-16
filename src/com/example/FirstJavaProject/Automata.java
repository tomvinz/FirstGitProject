package com.example.FirstJavaProject;
/**
 * A simple implementation of an FSA that should be finalized.
 */
import java.util.StringTokenizer;
import java.lang.*;

public class Automata {

    int index;
    //String[] tape=null;
    //int currentstate=0;
    String grammer=null;
    String[][] tmatrix=null;
    // YOUR CODE HERE
    /**
     * Constructor taking the grammar String which defines the behavior of this
     * automata.
     */
    public Automata(String grammarDef) {
        parseGrammar(grammarDef);
    }

    /**
     * An internal method that parses the given grammar String.
     */
    protected void parseGrammar(String grammarDef) {
        // YOUR CODE HERE
        grammer=grammarDef;

        String[] rows=grammer.split("\\n");
        System.out.println(rows[0]);
        tmatrix = new String[rows.length][];
        int r = 0;
        for (String row : rows) {
            tmatrix[r++]= row.split("\\t");
        }
       /* for(int i=0;i<rows.length;i++) {

                System.out.print(tmatrix[i][row1]);
            }
        }*/

    }

    /**
     * This method should return true if the complete given text is accepted by the
     * FSA. If this is not the case, false should be returned.
     */

  /*public int tokens(String token){
        String token3= token;
        int z;
        if (token3.equals("a")){
            z=2;
            return z;

        }
        else if(token3=="b"){
            z=1;
            return z;
        }
        else if(token3=="!") {
            z=3;
            return z;

        }
        else{
            return 0;
        }


    }*/
    public boolean acceptsString(String text) {
        boolean accepted = false;

       int temp=0;
        int currentstate=0;
      /*//*  String tape=text;
        //for(int i=0;i<text.length();i++)
        int c=0;
        index=tape.charAt(c);
        System.out.println(index);
        currentstate=1;
        while(true){
            if(index=="\n"){
                if(currentstate==4){
                    accepted=true;
                    //return accepted;
                }
                else{
                    accepted=false;
                }

            }
            else if (tmatrix[currentstate][index]==null){
                accepted=false;
            }
            else{
                currentstate=tmatrix[currentstate][index];
                c=c+1;
            }
            return accepted;
        }*/

        // YOUR CODE HERE
       /// YOUR CODE HERE

        //@Deprecated
        // if returnDelims is true, use string itself as a delimiter
        //*StringTokenizer st = new StringTokenizer(text1,text1,true);
        //System.out.println(st.nextToken());
        //while(st.hasMoreTokens()){*//*

       // int temp=0;
        //int currentstate=0;
        String text1=text+"\n";
        int i=0;
        while(i < text1.length()){
            String s = Character.toString(text1.charAt(i));
            if(s.equals("a")){
                temp=1;
                System.out.println("inside temp 1");
            }
            else if(s.equals("b")){
                temp=2;
                System.out.println("inside temp 2");
            }
            else if(s.equals("!")){
                temp=3;
                System.out.println("inside temp 3");
            }
            else{
                System.out.println("Not in scope");

            }
            //String token1=st.nextToken();
            if(s.equals("\n")){
                if(currentstate==4){
                    accepted=true;
                    System.out.println("First if");
                    //return accepted;
                    i++;
                }
                else{
                    accepted=false;
                    System.out.println("Second if");
                   // return accepted;
                    i++;
                }

            }
            else if(tmatrix[currentstate][temp]==null){
                accepted=false;
                System.out.println("Else if");
                //return accepted;

            }
            else{
                //System.out.println(tmatrix[1][2]);
               System.out.println(currentstate);
                currentstate=Integer.parseInt(tmatrix[++currentstate][temp]);
               i++;
            }
            //return accepted;
            System.out.println(accepted);
        }
        return accepted;
    }
}
