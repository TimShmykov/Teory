class HelloW {
    public static void main(String[] args){
        System.out.println("Hello, World");
    }
}

class Test1 {                                          //Типы данных в Java
    public static void main(String[] args ) {
       byte number1 = 15;                           // -128 до +128    в 1 байте 256 значений
       short number2 = 100;                         //  2 байта 2^15 = 65к -+32к
       int k = 10;                                  // 4 байта 2^31
       long number3 = 10000000;                     // 8 байта 2^63
       String title = "I'm going to JAIL";
       char letter = 'M';
       double sum = 145.123749;     // 8 байт
       float Pi = 3.14f;         // 4 байта
       boolean result = true;          // only true or false
       System.out.println(number1);
       System.out.println(number2);
       System.out.println(number3);
       System.out.println(title);
       System.out.println(k);
       System.out.println(letter);
       System.out.println(sum);
       System.out.println(Pi);
       System.out.println(result);
        }
}
class Test2 {
    public static void main(String[] args) {
        int k = 70;
        int p = 10;
        int f = 5;
        int m = k+p;
        System.out.println(m);
        m -=30;
        System.out.println(m);
        int s = m*f;
        System.out.println(s);
        s /=f;
        System.out.println(s);
    }
}
class Incr {
    public static void main(String [] args) {
        int n =2; // инкремент применяется только к переменной, недопустимо написание 8++!!!!
        int k =2;
        int a = 2 * n++; //теперь значение а = 4, а n = 3   постфиксная форма
        int b = 2 * ++k; //now b = 6, and k = 3      префексная форма инкремента (++)
        System.out.println(a);
        System.out.println(n);
        System.out.println(b);
        System.out.println(k);
    }
}

class Human {                           //все находится в классах
    int age = 23;             // параметры состояния?
    double weight = 78;

    void buyMilk() {
        System.out.println("Купи молока");
    } //методы поведения
    void buyBred() {
        System.out.println("Купи хлеб");
    }
    void birthday() {
      age = ++age;
      System.out.println(age);
    }
    void eatBigMac() {
       weight +=0.27;
       System.out.println(weight);
    }
    public static void main(String [] args) {             // сигнатура, запускающая код
       Human human = new Human();                       //  main вход в программу, прога выполняется отсюда
       human.buyMilk();
       human.buyBred();
       human.birthday();
       human.eatBigMac();
       Human friend = new Human();           // friend - ссылка

       Car car = new Car ();              // ссылка на объект Car
    }
}
class Car {                    // объект Car

}











