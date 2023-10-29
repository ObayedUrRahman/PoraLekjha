import java.util.Scanner;

// Abstract class
        abstract class Animal {
            // Abstract method (does not have a body)
            public abstract void animalSound();
            // Regular method
            public void sleep() {
                System.out.println("Zzz");
            }
        }

// Subclass (inherit from Animal)
        class Pig extends Animal {
            int age;
            Pig(int j)
            {
                this.age=j;
            }
            public void animalSound() {
                if(age>=30)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("tru4e");
                }
            }
        }
        class Cow extends Animal {

            int age;
            Cow(int j)
            {
                this.age=j;
            }
            public void animalSound() {

                if(age>=20)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("tru4e");
                }
            }


        }

        class Main {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                Cow myCow = new Cow(sc.nextInt());
                Pig myPig = new Pig(sc.nextInt()); // Create a Pig object
                myPig.animalSound();
                myCow.animalSound();
                myPig.sleep();
            }
        }
