public class TvShow {
    private String showName;
    private int episodes;
    private String genre;

    public TvShow(String name, int episode, String gnre) {
        this.showName = name;
        this.episodes = episode;
        this.genre = gnre;
    }

    public String getShowName() {
        return showName;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return ("The name of the show is " + getShowName() + " with " + getEpisodes() + " number of episodes. The genre is " + getGenre());
    }
}