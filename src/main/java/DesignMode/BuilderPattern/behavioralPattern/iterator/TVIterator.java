package DesignMode.BuilderPattern.behavioralPattern.iterator;

public interface TVIterator {
    Object currentChannel();

    void next();

    void prevous();

    void setChannel(int i);

    boolean isFirst();

    boolean isLast();
}
