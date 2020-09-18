package Delegate;

import java.io.BufferedReader;

public interface Delegate {
    String execute(BufferedReader br,char Delimiter, String path_shuffler);
    /*public interface Command{
        void execute (Object data);
    }
    public static class PrintCommand implements Command{
        @Override
        public void execute(Object data) {
            System.out.println(data.toString());
        }
    }
    public static void callCommand(Command command,Object data){
        command.execute(data);
    }
    public static void main(String []args){
        callCommand(new PrintCommand(),"hello world");
    }*/
}
