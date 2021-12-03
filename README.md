yandex-scooter
=========================

Testing qa-yandex-scooter.ru

Конфигурация mvn для запуска всех тестов в Firefox
---------------
```bash
clean test -Dselenide.browser=firefox
```
Конфигурация mvn для запуска всех тестов в Сhrome. В браузере хром есть ошибки,2 теста должны упасть.
---------------
```bash
clean test -Dselenide.browser=chrome
```
