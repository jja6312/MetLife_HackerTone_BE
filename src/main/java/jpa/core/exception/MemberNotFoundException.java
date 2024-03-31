package jpa.core.exception;

public class MemberNotFoundException extends RuntimeException {
    public MemberNotFoundException() {
        super("Not Found member Id");
    }
}
