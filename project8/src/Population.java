/** Класс для расчета популяции населения США */
public class Population {

  static long begin = 312032486; // Популяция в начале
  static long psec = 60*24*365; // секунд в году

  // Расчет популяции каждые 5 лет в течении 100 лет
	public static void main(String[] args) {
    long curr = 0; // текущая популяция
    long delta = 0;
    for (int i = 0; i <= 100; i=i+5) {
      curr = CalcPopulation(i);
      delta = curr - CalcPopulation(i-5);
			System.out.printf("%d:\t%d\t+%d\n", i, curr, delta);
 		}
  }

  // Расчет популяции на любой год
	public static long CalcPopulation(int year) {
  	long res = 0;
  	if (year <= 0) {
			res = begin;
    } else {
			long birth = (long) (year * 60.0 / 7 * psec);
  		long death = (long) (year * 60.0 / 13 * psec);
  		long mig =   (long) (year * 60.0 / 45 * psec);
    	res = begin + birth + mig - death;
		}
		return res;
	}
}
