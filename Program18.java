interface AnimalEat {
   void eat();
}
interface AnimalTravel {
   void travel();
}
class Animal implements AnimalEat, AnimalTravel {
   public void eat() {
       System.out.printIn("Animal is eating");
 }
   public void travel() {
       System.out.printIn("Animal is travelling");
 }
}
public class Demo {
   public static void main(String args[]) {
      Animal a = new Animal();
      a.eat();
      a.travel();
 }
}
