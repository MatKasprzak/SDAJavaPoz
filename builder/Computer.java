package pl.sda.poznan.builder;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Computer {
    private String processor;
    private String hdd;
    private String ram;
    private String motherBoard;

    public Computer(String processor, String hdd, String ram, String motherBoard) {
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
        this.motherBoard = motherBoard;
    }

    public static class ComputerBuilder{
        private String processor;
        private String hdd;
        private String ram;
        private String motherBoard;

        public ComputerBuilder addProcessor(String processor){
            this.processor = processor;
            return this;
        }
        public ComputerBuilder addHdd(String hdd){
            this.hdd = hdd;
            return this;
        }
        public ComputerBuilder addRam(String ram){
            this.ram = ram;
            return this;
        }
        public ComputerBuilder addMatherBoard(String motherBoard){
            this.motherBoard = motherBoard;
            return this;
        }
        public Computer build(){
            return new Computer(processor, hdd, ram, motherBoard);
        }
    }
}
