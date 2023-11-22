package task3_2;

import java.util.Random;

public class PrimeRequest {
    public String name;
    public  int length;
    public  String numbers;

    public PrimeRequest(){
        this.name = "Ратников Юрий Павловмч";
        this.length = 20;
        this.numbers = "";
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numbers += random.nextInt(100) + ", ";
        }

        numbers = numbers.substring(0, numbers.length() -2);
    }
}
