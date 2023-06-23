# **Задание 1 — обязательное**

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать приложение для расчёта миль. Напомним, мили начисляются как 1 миля за каждые 20 рублей в стоимости билета, дробные мили не допускаются.

Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в Main мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

Создайте класс BonusMilesService: File -> New -> Java Class, вводите название и нажимаете Enter.

Определите в нём метод calculate, который:

* принимает на вход один параметр: цену билета, типа int;
* анализируя значение переданного параметра, возвращает рассчитанное количество миль.
Разместите следующий код в классе Main:

```
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
```
