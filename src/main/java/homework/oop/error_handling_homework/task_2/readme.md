Пользовательские исключения

1. Создай класс пользовательского исключения InsufficientFundsException
    - он должен наследоваться от Exception.
2. Напиши программу, которая моделирует банковский счет с методами:
    - можешь взять костяк отсюда - [readme.md](../../inheritance_homework/task_2/readme.md)
    - deposit(double amount)
    - withdraw(double amount) - должен вызывать InsufficientFundsException,
      если на счете недостаточно средств для снятия (надо обработать это исключение
      в блоке try-catch)