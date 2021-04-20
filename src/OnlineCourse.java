public class OnlineCourse extends Course {
    private double videoCourseTime;
    private double onlineCourseTime;

    void printInfo(){
        System.out.println(" identyfikator: " + getIdentifier() + "\n cena: " + getPrice() + "\n tytuł: " + getTitle()
        + "\n opis: " + getDescription() + "\n godziny wideo kursu: " + videoCourseTime + "\n czas trwania kursu " +
                "online: " + getOnlineCourseTime());
    }

    public double getVideoCourseTime() {
        return videoCourseTime;
    }

    public void setVideoCourseTime(double videoCourseTime) {
        this.videoCourseTime = videoCourseTime;
    }

    public double getOnlineCourseTime() {
        return onlineCourseTime;
    }

    public void setOnlineCourseTime(double onlineCourseTime) {
        this.onlineCourseTime = onlineCourseTime;
    }

    public OnlineCourse(String identifier, double price, String title, double videoCourseTime,double onlineCourseTime) {
        this.videoCourseTime = videoCourseTime;
        this.onlineCourseTime = onlineCourseTime;

        setIdentifier(identifier);
        setPrice(price);
        setTitle(title);
    }
}




