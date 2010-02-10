package net.intelie.clojure;

import clojure.lang.RT;
import clojure.lang.Var;


/**
 * @author hubertfonseca
 */
public class Main {


    public static void main(String[] args) throws Exception {
        // Load the Clojure script -- as a side effect this initializes the runtime.
//        RT.loadResourceScript("net/intelie/clojure/foo.clj");
//
//        // Get a reference to the foo function.
//        Var foo = RT.var("net.intelie.clojure.foo", "foo");
//
//        // Call it!
//        Object result = foo.invoke("Hi", "there");
//        System.out.println(result);


        net.intelie.clojure.random g = new net.intelie.clojure.random();

        System.out.println(g.rdm());
        System.out.println(g.rdm());
        System.out.println(g.rdm());
    }
    
}
