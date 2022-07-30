package org.hjnu.pojo;

import java.io.*;

public class User implements Serializable {
    Integer id;
    String username;
    String password;

    public void setId(Integer id) {
        this.id = id;
    }
}
