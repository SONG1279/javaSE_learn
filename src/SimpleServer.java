
import javax.sound.midi.Soundbank;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleServer {

    public static ArrayList<Socket> socketList = new ArrayList<Socket>();

    public static void main(String[] args)
            throws IOException {

        ServerSocket ss = new ServerSocket(30000);
        while (true) {
            Socket s = ss.accept();
            socketList.add(s);
            new Thread(new ServerThread(s)).start();
        }
    }

    static class ServerThread implements Runnable{
        Socket socket = null;
        BufferedReader br = null;
        public ServerThread(Socket s) throws IOException{
            this.socket = s;
            br = new BufferedReader(new InputStreamReader(s.getInputStream(), "utf-8"));
        }

        @Override
        public void run() {
            try {
                String content = null;
                while ((content = readFromClinet()) != null){
                    for (Iterator<Socket> it = SimpleServer.socketList.iterator(); it.hasNext();){
                        Socket s = it.next();
                        try{
                            OutputStream os = s.getOutputStream();
                            os.write((content + "\n").getBytes("utf-8"));
                        }catch (SocketException e){
                            e.printStackTrace();
                            it.remove();
                            System.out.println(SimpleServer.socketList);
                        }
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        private String readFromClinet(){
            try {
                return br.readLine();
            }catch (IOException e){
                e.printStackTrace();
                SimpleServer.socketList.remove(socket);
            }
            return  null;
        }
    }
}