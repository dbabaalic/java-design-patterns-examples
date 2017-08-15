package structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        System.out.println("Mark is trying to open folder.");
        User mark = new User("Mark", "pass123");
        Folder folder = new FolderProxy(mark);
        folder.open();


        System.out.println("------------------------");

        System.out.println("Unknown user is trying to open folder.");
        User unknownUser = new User("unknown", "random_pass");
        Folder folder2 = new FolderProxy(unknownUser);
        folder2.open();

    }
}
