package dao;

import java.io.Closeable;
import java.io.IOException;

public interface CrudDao {
    default void close(Closeable closeable) throws IOException {
        if(closeable !=null){
            closeable.close();
        }
    }
}
