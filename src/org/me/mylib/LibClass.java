
package org.me.mylib;


public class LibClass {
    public static String acrostic(String[] args){
        //comment for A and otherwise
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > i){
                b.append(args[i].charAt(i));
            }
            else {
                b.append('?');
            }
        }
        return b.toString();
    }
}
