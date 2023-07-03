public class TV {
        private Channel[] channels;
        private int countOfChannels;

        public TV() {
                this.channels = new Channel[10];
                this.countOfChannels = 0;
        }

        public void addChannel(Channel channel) {
                if (countOfChannels < channels.length) {
                        channels[countOfChannels] = channel;
                        countOfChannels++;
                } else {
                        System.out.println("Невозможно добавить больше каналов");
                }
        }

        public void runChannel(int channelNumber) {
                if (channelNumber >= 0 && channelNumber < countOfChannels) {
                        channels[channelNumber].showProgram();
                } else {
                        System.out.println("Неверный номер канала");
                }
        }
}



