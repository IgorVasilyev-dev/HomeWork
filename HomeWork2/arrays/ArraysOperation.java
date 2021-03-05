package HomeWork2.arrays;

public  class ArraysOperation implements IArraysOperation {

    @Override
    public String methodDoWhile(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        do {
            if( i == 0) {
                str.append("{").append(container[i]);
            } else if ( i < container.length) {
                str.append(",").append(container[i]);
            } else {
                str.append("}");
            }
            i++;
        } while (i <= container.length);
        return str.toString();
    }

    @Override
    public String methodWhile(int[] container) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < container.length) {
            if( i == 0) {
                str.append("{").append(i);
            } else if ( i == container.length - 1) {
                str.append("}");
            } else {
                str.append(",").append(i);
            }
            i++;
        }
        return str.toString();
    }

    @Override
    public String methodFor(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < container.length; i++) {
            if( i == 0) {
                str.append("{").append(i);
            } else if ( i == container.length - 1) {
                str.append("}");
            } else {
                str.append(",").append(i);
            }
        }
        return str.toString();
    }

    @Override
    public String methodForEach(int[] container) {
        StringBuilder str = new StringBuilder();
        str.append("{");
        for (Integer e: container) {
            str.append(e);
        }
        str.append("}");
        return str.toString();
    }
}




