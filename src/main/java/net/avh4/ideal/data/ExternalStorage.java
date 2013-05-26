package net.avh4.ideal.data;

import java.util.List;

public interface ExternalStorage {

    File getFile(String filename);

    List<String> getFiles();
}
