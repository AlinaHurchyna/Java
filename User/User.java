package User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class User {
    private String nickname;
    private Date creationDate;

    public User(String nickname, Date creationDate) {
        this.nickname = nickname;
        this.creationDate = creationDate;
    }

    public String getNickname() {
        return nickname;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
