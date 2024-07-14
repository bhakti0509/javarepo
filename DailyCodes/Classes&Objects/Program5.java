//Types of Methods in Java : 1) Static Methods 2) Instance Methods

class Demo{

    static void fun(){
        System.out.println("In fun");
    }
    public static void main(String[] args){

        //There are three ways to call a static method from main method

        //Way 1

        Demo obj = new Demo();
        obj.fun();

        //Way 2

        fun();

        //Way 3

        Demo.fun();

    }
}