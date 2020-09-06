package engine;

public class Quiz {

    private String title;
    private String text;
    private String[] options;


    public Quiz() {
        title = "The Java Logo";
        text = "What is depicted on the Java logo?";
        options = new String[] {"Robot", "Tea leaf", "Cup of coffee", "Bug"};
    }
    public Quiz(String title, String text, String[] options) {
        this.title = title;
        this.text = text;
        this.options = options;
    }
    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
    public String[] getOptions() {
        return options;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
}