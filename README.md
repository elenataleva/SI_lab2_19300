 Control Flow Graph 
![cfg](https://user-images.githubusercontent.com/64106839/120227855-496a3e00-c24a-11eb-8193-9de485f341a8.PNG)

Цикломатска комплексност
Според мојот граф цикломатската комплексност e 4.
Дојдив до тој резултат со броењето на региони. Пред да го нацртам графот поставив реден број на секоја линија код во
функцијата function.

Тест случаи според критериумот Multiple condition
If(h1<0 || hr>24)
T X
F T
if (min < 0 || min >= 60)
T X
F T
F F

else (hr == 24 && min == 0 && sec == 0)
T T T
T T F
T F X
F X X

