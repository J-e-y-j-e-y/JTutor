1. Изучи абстрактный класс AbstractRobot
2. Создай два интерфейса: Attackable и Defensable
    - для Attackable: перенеси в него объявление метода attack() из AbstractRobot, логику оставь в AbstractRobot
    - для Defensable: перенеси в него объявление метода defense() из AbstractRobot, логику оставь в AbstractRobot
3. Создай 2 класса: RobotDefender и RobotAttacker
   - унаследуй каждый из них от AbstractRobot
   - RobotDefender должен имплементировать интерфейс Defensable
   - RobotAttacker должен имплементировать интерфейс Attackable
   - добавь им конструктор с двумя входными параметрами (String name, String team)
   - добавь в конструкторе каждого из классов вызов конструктора супер класса (ключевое слово super)
4. Добавь логику в класс AbstractRobot:
   - в методе attack() в начале добавь проверку, что текущий объект реализует интерфейс Attackable
   - в методе defense() в начале добавь проверку, что текущий объект реализует интерфейс Defensable
   - подсказка: используй this и instanceof
5. Раскомментируй метод main класса MainBattle
6. Наслаждайся битвой роботов)