/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

interface Interfaces{
    public void eat();
    public void travel();
    public static void main(String args[]){
        System.out.println("This is what Mammal class implements!");
Mammal m = new Mammal();
m.eat();
m.travel();
m.setNoOfLegs(4);
        System.out.println();
        System.out.println("This is what Imp class implements!");
Imp i=new Imp();
i.canTalk();
i.canLearn();
i.eat();
i.travel();
i.setNoOfLegs(2);
        System.out.println();
        System.out.println("This is what Live class implements!");
        Live l=new Live();
        l.canLive();
        l.eat();
        l.travel();
        l.canTalk();
        l.canLearn();
        l.setNoOfLegs("Differs");
        System.out.println();
}
}
interface human extends Interfaces{
    public void canTalk();
    public void canLearn();
}
interface h extends Interfaces,human{
    public void canLive();
}
 class Mammal implements Interfaces{
public int noOfLeg;
public void eat(){
System.out.println("Mammal eats");
}
public void travel(){
System.out.println("Mammal travels");
}
public void setNoOfLegs(int noOfLeg){
this.noOfLeg = noOfLeg;
System.out.println( "no of Legs : "+noOfLeg);
}

}
class Imp implements human{
    public int noOfLeg;

         public void eat()
{
    System.out.println("Human can eat!");
}
    public void travel(){
        System.out.println("human can travel!");
}
     public void canTalk()
     {
         System.out.println("human can talk!");
     }
    public void canLearn()
    {
        System.out.println("human can learn!");
    }
        public void setNoOfLegs(int noOfLeg){
this.noOfLeg = noOfLeg;
System.out.println( "no of Legs : "+noOfLeg);
}
}
class Live implements h{
        public String noOfLeg;

        public void canLive()
        {
            System.out.println("every one can live!");
        }
        public void eat()
        {
            System.out.println("every one have to eat!");
        }
    public void travel()
    {
        System.out.println("everything travels!");
    }
    public void canTalk()
    {
        System.out.println("everything talks!");
    }
    public void canLearn()
    {
        System.out.println("everyone learns!"); 
    }
    public void setNoOfLegs(String noOfLeg){
this.noOfLeg = noOfLeg;
System.out.println( "no of Legs : "+noOfLeg);
}

}
