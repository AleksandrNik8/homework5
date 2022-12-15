//Задача №2
//Необходимо:
// 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать объект этого класса прямо здесь (class Homework5, метод main), с доходами 500, расходами 300
// 4. Записать в файл "report.txt" данные из объекта класса.
// Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FinancialRecord fRecord = new FinancialRecord(500, 300);
        String fileToWrite = "D:\\program\\progi\\lesson10Homework5Task02\\src\\report.txt";
        FileWriter fileWriter = new FileWriter(fileToWrite);
        String resultBuffered = "incomes = " + fRecord.getIncomes() + ", outcomes = " + fRecord.getOutcomes();
        fileWriter.write(resultBuffered);
        fileWriter.close();
        System.out.println(resultBuffered);
    }
}