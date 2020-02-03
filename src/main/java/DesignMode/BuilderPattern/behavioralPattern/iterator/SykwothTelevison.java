package DesignMode.BuilderPattern.behavioralPattern.iterator;

/**
 * @ClassName SykwothTelevison
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 15:50
 * @Version 1.0
 **/
public class SykwothTelevison implements Televison {
    private Object[] obj = {"中央-1","中央-2","中央-3","中央-4","中央-5","中央-6","中央-7","中央-8","中央-9"};


    @Override
    public TVIterator createIterator() {
        return new SykworthIterator();
    }

    private class SykworthIterator implements TVIterator {
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
