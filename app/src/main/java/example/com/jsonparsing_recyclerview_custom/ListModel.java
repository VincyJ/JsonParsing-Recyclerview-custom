package example.com.jsonparsing_recyclerview_custom;

public class ListModel {

    int rank;
    String countryname;
    String population;

    public ListModel(int rank, String countryname, String population) {
        this.rank = rank;
        this.countryname = countryname;
        this.population = population;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }


}
