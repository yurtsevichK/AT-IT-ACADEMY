package by.it.yurtsevich.homeTasks.homeTask_day1;

public class Task1_1 {
    /*1. Описать разницу между i++ и ++i, привести пример.
        i++ - увеличивает переменную i на 1(один), и (компилятор уже знает новое значение переменной), но
        выводит новое значение переменной i после вычислений с ней (присвой, потом прибавь)
        ++i - увеличивает переменную i на 1(один), и выводит(знает/использует) новое значение переменной i до вычеслений с ней
        (сначала прибавь, потом присвой)
    */
    // Пример:
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        /* В данном случае мы увеличиваем значение переменной a типа данных int на один(++), и сразу же видим новое
        значение переменной
         */
        System.out.println(++a);
        System.out.println(a);
        /* В данном случае мы увеличиваем значение переменной b типа данных int на один(++), но видим новое значение
        переменной, то при последующем ее использовании
         */
        System.out.println(b++);
        System.out.println(b);
    }
}