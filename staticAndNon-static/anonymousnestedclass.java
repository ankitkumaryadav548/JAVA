//anonymous nested class => file is not created while executing the anonymous code
//we don't have class name
//at time of class declaration we create object
//this only for one time use
//event handling => just click on button

interface Demo {
    void print() ;    
}

class Main{
    public static void main(String[] args){
        Demo d =new Demo() {
                public void print(){  //method 
                    System.out.println("anonymous class") ;
                }
        };
        d.print();
    }
}
