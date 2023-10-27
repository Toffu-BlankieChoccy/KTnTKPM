package practiceIterator.example;

public class ArrayIterator extends Iterator63{
    ArrayCollection arrayCollection;
    private int index;

    public ArrayIterator(ArrayCollection arrayCollection) {
        this.arrayCollection = arrayCollection;
    }

    @Override
    public Object first() {

        if(arrayCollection.count()>0){
            index = 0;
            return arrayCollection.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
//        if(index == arrayCollection.count()-1)
//            return null;
//        return arrayCollection.getItem(index);
        if(!isDone())
            return arrayCollection.getItem(index++);
        return null;
    }

    @Override
    public Object current() {
        if(index>=0){
            return arrayCollection.getItem(index);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return (index == arrayCollection.count()-1);
    }
}
