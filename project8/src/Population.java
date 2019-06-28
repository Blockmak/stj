public class Population {
	public static void main(String[] args) {
  	int begin = 312032486; // Популяция в начале
    int curr = 0; // текущая популяция
    int prev = begin; // предыдущая популяция
		int psec = 60*24*365*5; // секунд в 5 годах
		int birth = 0;
		int death = 0;
		int mig = 0;
    int delta = 0;
    for (int i = 0; i <= 100/5; i++) {
      birth = (int) (i * 60.0 / 7 * psec);
      death = (int) (i * 60.0 / 13 * psec);
      mig =   (int) (i * 60.0 / 45 * psec);
      curr = begin + birth + mig - death;
      delta = curr - prev;
			System.out.printf("%d:\t%d\t+%d\n", i*5, curr, delta);
      prev = curr;
 		}
  }
}
