package Inheritance;

class Animal
{
    void sleep()
    {
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal
{

}

class MOnkey extends Animal
{

}
class Deer extends Animal
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