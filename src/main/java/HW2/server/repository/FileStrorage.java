package HW2.server.repository;

import java.io.FileReader;
import java.io.FileWriter;

public class FileStrorage implements Repository<String> {
    private static final String LOG_PATH = "src/main/java/HW2/server/repository/history.txt";

    @Override
    public void save(String text) {
        try(FileWriter writer = new FileWriter(LOG_PATH,true)){
            writer.write(text);
            writer.write("\n");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public String load() {
        StringBuilder stringBuilder = new StringBuilder();
        try(FileReader reader = new FileReader(LOG_PATH)) {
            int c;
            while ((c = reader.read()) != -1){
                stringBuilder.append((char) c);
            }
            stringBuilder.delete(stringBuilder.length() - 1,stringBuilder.length());
            return stringBuilder.toString();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
