package model;

public class Feeds {
    private final String w_id;
    private final String a_id;

    public Feeds(String w_id, String a_id) {
        this.w_id = w_id;
        this.a_id = a_id;
    }

    public String getW_id() {
        return w_id;
    }

    public String getA_id() {
        return a_id;
    }
}

