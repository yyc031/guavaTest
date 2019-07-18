package com.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : yyc
 * @date : 2019-7-10
 */
public class IoTest {

    public void writeFile(String path) throws IOException {
        String content = "id,username,realname,gender";

        File file = FileUtils.getFile(path);

        List<String> list = new ArrayList<String>();
        list.add(content);


        FileUtils.writeLines(file, "UTF-8", list, true);
    }
}
