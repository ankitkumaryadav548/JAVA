// //arrayIndexOutOfBoundsException

import java.util.* ;

// import javax.swing.plaf.synth.SynthTextAreaUI;
class arrayIndexOutOfBoundsException{
    public static void main(String[] args){

    
    int []arr = {12,12,23,3,43,45};
    // System.out.println("array element of index 3 " + arr[3]);
    try{
        System.out.println("array element of index 5 " + arr[8]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("");
    }
}
}