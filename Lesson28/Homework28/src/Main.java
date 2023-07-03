public class Main {
    public static void main(String[] args) {


        TV tv = new TV();
        Channel channel1 = new Channel(1);
        Channel channel2 = new Channel(2);
        Channel channel3 = new Channel(3);

        Program program1 = new Program("News");
        Program program2 = new Program("Comedy");
        Program program3 = new Program("Wetter");
        Program program4 = new Program("Ballet");
        channel1.addProgram(program1);
        channel1.addProgram(program2);
        channel2.addProgram(program3);
        channel3.addProgram(program4);

        tv.addChannel(channel1);
        tv.addChannel(channel2);
        tv.addChannel(channel3);

        RemoteController remote = new RemoteController(tv);

        remote.on(0);
        remote.on(1);
        remote.on(2);
        remote.on(3);


    }


}