public class Variable {
	public static void main(String[] args){

		/*
			09.06.2020

			TODO:
			Объявить переменные всех типов
			Каждой переменной присвоить значение
			В качестве значений использовать информацию о своем компьютере
			Вывести все значения в консоль


		*/

		byte cpuCoreNum = 4;
		short ramSize = 16384;
		int cpuCoreFreq = 3000;
		long firstHddCap = 715404;
		float cpuVcore = 1.264f;
		double vBat = 3.248d;
		char cpuNameFirstLetter = 'X';
		boolean isTurnedOn = true;

		System.out.println("Количесвто ядер процессора - " + cpuCoreNum);
		System.out.println("Объем оперативной памяти - " + ramSize);
		System.out.println("Тактовая частота процессора - " + cpuCoreFreq);
		System.out.println("Объем первого жесткого диска - " + firstHddCap);
		System.out.println("Напряжение CPU VCORE - " + cpuVcore);
		System.out.println("Напряжение VBAT - " + vBat);
		System.out.println("Первая буква названия процессора - " + cpuNameFirstLetter);
		System.out.println("Включен ли сейчас компьютер - " + isTurnedOn);



	}
}