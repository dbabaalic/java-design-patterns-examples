package behavioural.strategy;

public class File {

    private FileSavingStrategy fileSavingStrategy;

    public void setFileSavingStrategy(FileSavingStrategy fileSavingStrategy) {
        this.fileSavingStrategy = fileSavingStrategy;
    }

    public void save(){
        fileSavingStrategy.save();
    }
}
