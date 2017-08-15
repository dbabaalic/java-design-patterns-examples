package structural.proxy;

public class FolderProxy implements Folder {

    private Folder folder = new FolderImpl();
    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void open() {
        if(user.getName().equals("Mark") && user.getPassword().equals("pass123")) {
            folder.open();
        } else {
            System.out.println("You are not authorized to access this folder.");
        }
    }
}
