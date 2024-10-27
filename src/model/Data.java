package model;

public class Data {

        private int numeber;
        private String Agency;
        private String NameClient;
        private Float Account;



    public Float getAccount() {
        return Account;
    }

    public void setAccount(Float account) {
        Account = account;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        Agency = agency;
    }

    public String getNameClient() {
        return NameClient;
    }

    public void setNameClient(String nameClient) {
        NameClient = nameClient;
    }

    public int getNumeber() {
        return numeber;
    }

    public void setNumeber(int numeber) {
        this.numeber = numeber;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Account=" + Account +
                ", numeber=" + numeber +
                ", Agency='" + Agency + '\'' +
                ", NameClient='" + NameClient + '\'' +
                '}';
    }
}
