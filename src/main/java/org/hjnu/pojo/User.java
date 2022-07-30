package org.hjnu.pojo;

import java.io.*;

public class User implements Serializable {
    Integer id;
    String username;
    String password;

    public Integer getId() {
        return id;
    }
}
