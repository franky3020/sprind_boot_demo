package com.example.db;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserDB_TEST {

    @Test
    public void getPhone_TEST() {
        UserDB userDB = UserDB.getInstance();
        String phoneNumber = userDB.getPhone(1);
        assertEquals("0911111111", phoneNumber);
    }
}
