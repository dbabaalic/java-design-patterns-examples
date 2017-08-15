package structural.proxy;

public class FolderImpl implements Folder {

    @Override
    public void open() {
        System.out.println("Opening folder.");
    }
}
