package Inheritance;


                          //Single Inheritance


class Animal       //parent class
 {
    void sleep()
    {
        System.out.println("Animal need sleep");
    } 
}

class Tiger extends Animal                //child class
{

}


 class Inheritance3
{

    public static void main(String[] args) 
 {
    Tiger t=new Tiger();
    t.sleep();
                
    }
}



              