package ru.top.homework7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.top.homework7.Person;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    //Задание 1
    //Создайте endpoint /api/home/greeting, который возвращает строку с приветствием "Welcome to Spring Boot API!"
    @GetMapping("/greeting")
    public String hi() {
        return "Welcome to Spring Boot API!";
    }

    //Задание 2
    //Создайте endpoint /api/home/numbers, который возвращает массив целых чисел от 1 до 10
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @GetMapping("/numbers")
    public int[] getArr() {
        return arr;
    }

    //Задание 3
    //Создайте endpoint /api/home/colors, который возвращает список (List) из 5 названий цветов (на английском или русском)
    List<String> list = List.of("red", "green", "blue", "yellow", "orange");

    //    public HomeController() {
//        list=new ArrayList<String>();
//        list.add("red");
//        list.add("blue");
//        list.add("green");
//        list.add("yellow");
//        list.add("orange");
//    }
    @GetMapping("/colors")
    public List<String> color() {
        return list;
    }

    //Задание 4
    //Создайте endpoint /api/home/status, который возвращает булевое значение true
    @GetMapping("/status")
    public boolean status() {
        return true;
    }
    //Задание 5
    //Создайте endpoint /api/home/fruits, который возвращает массив строк с названиями 4-5 фруктов

    String[] fruits = new String[]{"apple", "orange", "banana", "pear", "watermelon"};

    @GetMapping("/fruits")
    public String[] getFruits() {
        return fruits;
    }
    //Задание 6
    //Создайте endpoint /api/home/count, который возвращает целое число 100
    @GetMapping("/count")
    public int count(){
        return 100;
    }
    //Задание 7
    //Создайте endpoint /api/home/students, который возвращает список (List) из 3 объектов Person (студенты с разными именами и возрастами)
    List<Person> people = List.of(
            new Person("Дима",30),
            new Person("Коля",25),
            new Person("Ваня",28)

    );
    @GetMapping("/students")
    public List<Person> getStudent(){
        return people;
    }
    //Задание 8
    //Создайте endpoint /api/home/cities, который возвращает список (List) из 5 названий городов

    List<String>cities=List.of("Moscow","London","New York","Tokio","San Francisco");

    @GetMapping("/cities")
    public List<String>getCities(){
        return cities;
    }
    //Задание 9
    //Создайте endpoint /api/home/price, который возвращает дробное число (double) - например, 99.99

    @GetMapping("/price")
    public double price(){
        return 99.99;
    }
    //Задание 10
    //Создайте endpoint /api/home/weekdays, который возвращает массив строк с названиями дней недели (Monday, Tuesday, и т.д.)

    String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @GetMapping("/weekdays")
    public String[] getDays(){
        return days;
    }


}
