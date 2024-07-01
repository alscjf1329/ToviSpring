package main;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Constant {
    MYSQL_ADDRESS("jdbc:mysql://kr-1-ts.esukmean.com:20240"),
    MYSQL_DATABASE("sheepduck"),
    MYSQL_USER("SheepDuck");
    private final String content;

    public static String getFullAddress() {
        return MYSQL_ADDRESS.getContent() + "/" + MYSQL_DATABASE.getContent();
    }
}
