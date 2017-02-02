package simple;

public class TeamBean {
    // Home Team Variables
    String h_n;
    int h_o;
    int h_d;
    int h_s;
    // Away Team Variables
    String a_n;
    int a_o;
    int a_d;
    int a_s;

    public TeamBean() {
    }

    public TeamBean(String h_n, int h_o, int h_d, int h_s, String a_n, int a_o, int a_d, int a_s) {
        this.h_n = h_n;
        this.h_o = h_o;
        this.h_d = h_d;
        this.h_s = h_s;
        this.a_n = a_n;
        this.a_o = a_o;
        this.a_d = a_d;
        this.a_s = a_s;
    }

    public String getH_n() {
        return h_n;
    }

    public void setH_n(String h_n) {
        this.h_n = h_n;
    }

    public int getH_o() {
        return h_o;
    }

    public void setH_o(int h_o) {
        this.h_o = h_o;
    }

    public int getH_d() {
        return h_d;
    }

    public void setH_d(int h_d) {
        this.h_d = h_d;
    }

    public int getH_s() {
        return h_s;
    }

    public void setH_s(int h_s) {
        this.h_s = h_s;
    }

    public String getA_n() {
        return a_n;
    }

    public void setA_n(String a_n) {
        this.a_n = a_n;
    }

    public int getA_o() {
        return a_o;
    }

    public void setA_o(int a_o) {
        this.a_o = a_o;
    }

    public int getA_d() {
        return a_d;
    }

    public void setA_d(int a_d) {
        this.a_d = a_d;
    }

    public int getA_s() {
        return a_s;
    }

    public void setA_s(int a_s) {
        this.a_s = a_s;
    }

    @Override
    public String toString() {
        return "TeamBean{" +
                "h_n='" + h_n + '\'' +
                ", h_o=" + h_o +
                ", h_d=" + h_d +
                ", h_s=" + h_s +
                ", a_n='" + a_n + '\'' +
                ", a_o=" + a_o +
                ", a_d=" + a_d +
                ", a_s=" + a_s +
                '}';
    }
}
