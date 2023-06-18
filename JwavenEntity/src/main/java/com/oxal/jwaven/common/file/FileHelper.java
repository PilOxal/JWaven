package com.oxal.jwaven.common.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oxal.jwaven.common.entity.TypeWavenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
public class FileHelper {

    private static final String FORMAT_FILE = "%s.json";
    @Autowired
    private File file;
    @Autowired
    private ObjectMapper objectMapper;
    private List<File> folders;

    public void initFolders() {
        if (folders == null) {
            folders = List.of(file.listFiles());
        }
    }

    public <T> Optional<T> openWavenFile(TypeWavenEntity type, Long id, Class<T> c) throws IOException {
        initFolders();
        for(File f: folders) {
            if (f.getName().equals(type.getFolder())) {
                for (File json: f.listFiles()) {
                    if (json.getName().equals(FORMAT_FILE.formatted(id))) {
                        return Optional.of(objectMapper.readValue(json, c));
                    }
                }
            }
        }
        return Optional.empty();
    }
}
