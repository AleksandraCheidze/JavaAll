import java.util.Random;
public class Channel {
    private Program[] programs;
    private int countOfPrograms;

    public Channel(int number) {
        this.programs = new Program[10];
        this.countOfPrograms = 0;
    }



    public void addProgram (Program program) {
        if (countOfPrograms < programs.length) {
            this.programs[countOfPrograms] = program;
            this.countOfPrograms++;
        } else {
            System.out.println("Достигнуто максимальное количество программ для канала");
        }

    }

    public void showProgram() {
        if (countOfPrograms > 0) {
            Random random = new Random();
            int randomNumber = random.nextInt(countOfPrograms);
            System.out.println(programs[randomNumber].getProgramName());
        } else {
            System.out.println("Нет доступных программ");
        }
    }
}

