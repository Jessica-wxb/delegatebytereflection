package DesignMode.BuilderPattern.behavioralPattern.iterator;

import DesignMode.BuilderPattern.AbstractFactory.Television;

/**
 * @ClassName TCLTelevision
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 15:50
 * @Version 1.0
 **/
public class TCLTelevision implements Televison{
    private Object[] obj = {"CCTC-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5","CCTV-6","CCTV-7","CCTV-8","CCTV-9"};


    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TVIterator {
        private int currentIndex = 0;
        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public void next() {
            if (currentIndex < obj.length) {
                currentIndex++;
            }
        }

        @Override
        public void prevous() {
            if (currentIndex > 0) {
                currentIndex--;
            }

        }

        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }
    }
}
